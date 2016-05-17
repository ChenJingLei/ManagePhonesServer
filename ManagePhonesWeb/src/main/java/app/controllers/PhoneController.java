package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cjl20 on 2016/5/17.
 */
@Controller
public class PhoneController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String showMainPage(Model model) {
        model.addAttribute("welcome","欢迎您登陆本系统");
        return "views/main";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddPage() {
        return "views/add";
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public String showFindPage() {
        return "views/find";
    }

    @RequestMapping(value = "/navtest", method = RequestMethod.GET)
    public String showNavPage() {
        return "views/nav";
    }
}
