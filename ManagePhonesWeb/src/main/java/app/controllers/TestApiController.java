package app.controllers;

import app.models.Test;
import app.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cjl20 on 2016/6/19.
 */
@RestController
public class TestApiController {

    @Autowired
    private TestRepository testRepository;

    @RequestMapping(value = "/addtest", method = RequestMethod.POST)
    public String add(@RequestBody Test test){
        try{
            testRepository.save(test);
            return "su";
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
