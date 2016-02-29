package app.controllers;

import app.models.Goods;
import app.models.InWarehouse;
import app.models.Warehouse;
import app.repositories.GoodsRepository;
import app.repositories.InWarehouseRepository;
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
@RequestMapping(value = "/in")
public class InWarehouseController {

    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private InWarehouseRepository inWarehouseRepository;

    @Autowired
    private WarehouseRepository warehouseRepository;

    @RequestMapping(value = "/inGoods", method = RequestMethod.POST)
    public boolean inGoods(@RequestBody Goods goods) {
        try {
            if (inWarehouseRepository.findByImei(goods.getId()) != null) {
                return false;
            }

            if (goodsRepository.findByName(goods.getName()) == null) {
                goods = goodsRepository.save(goods);
            } else {
                goods = goodsRepository.findByName(goods.getName());
            }
            InWarehouse inWarehouse = new InWarehouse(goods.getId(), new Date());
            inWarehouse = inWarehouseRepository.save(inWarehouse);
            Warehouse warehouse = new Warehouse(inWarehouse.getImei(), goods.getId());
            warehouseRepository.save(warehouse);
            System.out.println(inWarehouse);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}
