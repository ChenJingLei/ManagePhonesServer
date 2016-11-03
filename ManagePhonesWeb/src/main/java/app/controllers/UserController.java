package app.controllers;

import app.models.User;
import app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by cjl20 on 2016/5/16.
 */
@RequestMapping(value = "/user")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody User user) {
        User loginer = userRepository.findOneByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (loginer == null) {
            return "login";
        }
        return "main";
    }

    @RequestMapping(value = "/checkExists", method = RequestMethod.POST)
    public boolean checkExists(@RequestBody User user) {
        if (user.getUsername() != null && user.getPassword() == null) {
            //存在用户么
            List<User> checkUsers = userRepository.findOneByUsername(user.getUsername());
            return (checkUsers.size() > 0);
        } else if (user.getPassword() != null) {
            //是否有用户信息
            User checkUser = userRepository.findOneByUsernameAndPassword(user.getUsername(), user.getPassword());
            return checkUser == null;
        }
        return false;
    }
}
