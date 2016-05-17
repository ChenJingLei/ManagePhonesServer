package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cjl20 on 2016/5/17.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {
        return "views/login";
    }
}
