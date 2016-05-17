package app.controllers;

import app.models.Goods;
import app.models.InWarehouse;
import app.models.OutWarehouse;
import app.models.Record;
import app.repositories.GoodsRepository;
import app.repositories.InWarehouseRepository;
import app.repositories.OutWarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjl20 on 2016/2/29.
 */
@RestController
@RequestMapping(value = "/record")
public class RecordController {

    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private InWarehouseRepository inWarehouseRepository;

    @Autowired
    private OutWarehouseRepository outWarehouseRepository;


    @RequestMapping(value = "/getRecordById/{Gid}")
    public List<Record> getRecordById(@PathVariable("Gid") String Gid) {
        List<Record> list = new ArrayList<>();
        InWarehouse inWarehouse = inWarehouseRepository.findByImei(Gid);
        OutWarehouse outWarehouse = outWarehouseRepository.findByImei(Gid);
        if (inWarehouse != null) {
            Goods goods = goodsRepository.findOne(inWarehouse.getGid());
            list.add(new Record(inWarehouse.getImei(), goods.getName(), inWarehouse.getIntime(), 0));
        }
        if (outWarehouse != null) {
            Goods goods = goodsRepository.findOne(outWarehouse.getGid());
            list.add(new Record(outWarehouse.getImei(), goods.getName(), outWarehouse.getOuttime(), 1));
        }
        return list;
    }

    @RequestMapping(value = "/getRecordByName/{Name}")
    public List<Record> getRecordByName(@PathVariable("Name") String Name) {
        List<Goods> goodsList = goodsRepository.findByNameLike(Name);
        List<Record> list = new ArrayList<>();
        if (goodsList != null) {
            for (Goods goods : goodsList) {
                List<InWarehouse> inWarehouses = inWarehouseRepository.findByGid(goods.getGid());
                List<OutWarehouse> outWarehouses = outWarehouseRepository.findByGid(goods.getGid());
                if (inWarehouses != null) {
                    for (InWarehouse in : inWarehouses) {
                        list.add(new Record(in.getImei(), goods.getName(), in.getIntime(), 0));
                    }
                }
                if (outWarehouses != null) {
                    for (OutWarehouse out : outWarehouses) {
                        list.add(new Record(out.getImei(), goods.getName(), out.getOuttime(), 1));
                    }
                }
            }
        }
        return list;
    }
}
