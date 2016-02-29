package app.repositories;

import app.models.Warehouse;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cjl20 on 2016/2/29.
 */
public interface WarehouseRepository extends CrudRepository<Warehouse,String> {
}
