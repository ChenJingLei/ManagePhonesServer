package app.controllers;

import app.models.Goods;
import app.models.OutWarehouse;
import app.repositories.GoodsRepository;
import app.repositories.InWarehouseRepository;
import app.repositories.OutWarehouseRepository;
import app.repositories.WarehouseRepository;
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
    private InWarehouseRepository inWarehouseRepository;

    @Autowired
    private OutWarehouseRepository outWarehouseRepository;

    @Autowired
    private WarehouseRepository warehouseRepository;

    @RequestMapping(value = "/outGoods", method = RequestMethod.POST)
    public boolean inGoods(@RequestBody Goods goods) {
        try {
            if (inWarehouseRepository.findByImei(goods.getId()) == null) {
                return false;
            } else if (outWarehouseRepository.findByImei(goods.getId()) != null) {
                return false;
            }
            outWarehouseRepository.save(new OutWarehouse(goods.getId(), new Date()));
            warehouseRepository.delete(goods.getId());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
