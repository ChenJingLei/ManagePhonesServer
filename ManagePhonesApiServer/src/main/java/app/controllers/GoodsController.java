package app.controllers;

import app.models.Goods;
import app.repositories.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjl20 on 2016/2/28.
 */
@RestController
@RequestMapping(value = "/goods")
public class GoodsController {

    @Autowired
    private GoodsRepository repository;

    @RequestMapping(value = "/getAllGoodsName", method = RequestMethod.GET)
    public List<String> getAllGoodsNmae() {
        List<Goods> goodses = repository.findAll();
        List<String> names = new ArrayList<>();
        for (Goods g : goodses) {
            names.add(g.getName());
        }
        return names;
    }
}
