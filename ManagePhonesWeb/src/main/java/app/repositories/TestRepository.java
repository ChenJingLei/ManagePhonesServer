package app.repositories;

import app.models.Test;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by cjl20 on 2016/6/19.
 */
public interface TestRepository extends CrudRepository<Test,Integer> {

    List<Test> findAll();

    Test findOne(Integer id);

    //select * from test where name =
    List<Test> findByName(String name);
}
