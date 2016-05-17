package app.repositories;

import app.models.Phone;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by cjl20 on 2016/5/17.
 */
public interface PhoneRepository extends CrudRepository<Phone,Integer> {

    List<Phone> findAll();
}
