package app.repositories;

import app.models.InWarehouse;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by cjl20 on 2016/2/28.
 */
public interface InWarehouseRepository extends CrudRepository<InWarehouse, Long> {

    InWarehouse findByImei(String imei);

    List<InWarehouse> findByGid(String gid);
}
