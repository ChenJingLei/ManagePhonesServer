package app.repositories;

import app.models.InWarehouse;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cjl20 on 2016/2/28.
 */
public interface InWarehouseRepository extends CrudRepository<InWarehouse, Long> {

    InWarehouse findByImei(String imei);
}
