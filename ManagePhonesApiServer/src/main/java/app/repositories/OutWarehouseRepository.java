package app.repositories;

import app.models.OutWarehouse;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cjl20 on 2016/2/28.
 */
public interface OutWarehouseRepository extends CrudRepository<OutWarehouse, Long> {

    OutWarehouse findByImei(String imei);
}
