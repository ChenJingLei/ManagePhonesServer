package app.controllers;

import app.models.Goods;
import app.models.InWarehouse;
import app.repositories.GoodsRepository;
import app.repositories.InWarehouseRepository;
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
@RequestMapping(value = "/in")
public class InWarehouseController {

    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private InWarehouseRepository inWarehouseRepository;


    @RequestMapping(value = "/inGoods", method = RequestMethod.POST)
    public boolean inGoods(@RequestBody Goods goods) {
        //用户传入的是imei码和goods名称
        try {
            if (inWarehouseRepository.findByImei(goods.getGid()) != null) {
                return false;
            }
            String imei = goods.getGid();
            if (goodsRepository.findByName(goods.getName()) == null) {
                goods = goodsRepository.save(goods);
            } else {
                goods = goodsRepository.findByName(goods.getName());
            }
            InWarehouse inWarehouse = new InWarehouse(goods.getGid(), imei, new Date());
            inWarehouseRepository.save(inWarehouse);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}
