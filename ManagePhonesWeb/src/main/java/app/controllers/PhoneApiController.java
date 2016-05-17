package app.controllers;

import app.models.Phone;
import app.repositories.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by cjl20 on 2016/5/17.
 */
@RestController
@RequestMapping(value = "/phones")
public class PhoneApiController {

    @Autowired
    private PhoneRepository phoneRepository;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Phone> getAllList() {
        return phoneRepository.findAll();
    }

    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.GET)
    public boolean deleteById(@PathVariable("id") Integer id) {
        try {
            phoneRepository.delete(id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @RequestMapping(value = "/updateOne", method = RequestMethod.POST)
    public boolean updateOne(@RequestBody Phone phone) {
        try {
            phone.setId(1);
            Phone phone1 = phoneRepository.save(phone);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @RequestMapping(value = "/getOne/{id}", method = RequestMethod.GET)
    public Phone getOne(@PathVariable("id") Integer id) {
        return phoneRepository.findOne(id);
    }
}
