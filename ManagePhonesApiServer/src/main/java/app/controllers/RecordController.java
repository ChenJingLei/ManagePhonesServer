package app.controllers;

import app.models.Goods;
import app.models.InWarehouse;
import app.models.OutWarehouse;
import app.models.Record;
import app.repositories.GoodsRepository;
import app.repositories.InWarehouseRepository;
import app.repositories.OutWarehouseRepository;
import app.repositories.WarehouseRepository;
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

    @Autowired
    private WarehouseRepository warehouseRepository;

    @RequestMapping(value = "/getRecordById/{Id}")
    public List<Record> getRecordById(@PathVariable("Id") String Id) {
        List<Record> list = new ArrayList<>();
        InWarehouse inWarehouse = inWarehouseRepository.findByImei(Id);
        OutWarehouse outWarehouse = outWarehouseRepository.findByImei(Id);
        if (inWarehouse != null){

//            list.add(new Record(Id,));
        }
//        if (outWarehouse != null) {
//            list.add(new Record(outWarehouse.getGid(), outWarehouse.getOuttime()));
//        }
        return list;
    }
}
