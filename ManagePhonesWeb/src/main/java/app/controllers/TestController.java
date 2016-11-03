package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cjl20 on 2016/6/19.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "views/test";
    }
}
