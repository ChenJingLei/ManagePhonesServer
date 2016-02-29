package app.repositories;

import app.models.OutWarehouse;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by cjl20 on 2016/2/28.
 */
public interface OutWarehouseRepository extends CrudRepository<OutWarehouse, Long> {

    OutWarehouse findByImei(String imei);

    List<OutWarehouse> findByGid(String gid);
}
