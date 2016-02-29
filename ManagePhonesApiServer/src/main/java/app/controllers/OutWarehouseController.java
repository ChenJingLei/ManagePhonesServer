package app.controllers;

import app.models.Goods;
import app.models.OutWarehouse;
import app.repositories.GoodsRepository;
import app.repositories.InWarehouseRepository;
import app.repositories.OutWarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by cjl20 on 2016/2/28.
 */
@RestController
@RequestMapping(value = "/out")
public class OutWarehouseController {

    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private InWarehouseRepository inWarehouseRepository;

    @Autowired
    private OutWarehouseRepository outWarehouseRepository;

    @RequestMapping(value = "/outGoods", method = RequestMethod.POST)
    public boolean inGoods(@RequestBody Goods goods) {
        try {
            if (inWarehouseRepository.findByImei(goods.getGid()) == null) {
                return false;
            } else if (outWarehouseRepository.findByImei(goods.getGid()) != null) {
                return false;
            }
            String imei = goods.getGid();
            goods = goodsRepository.findByName(goods.getName());
            outWarehouseRepository.save(new OutWarehouse(goods.getGid(), imei, new Date()));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
