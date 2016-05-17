package app.repositories;

import app.models.Goods;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by cjl20 on 2016/2/28.
 */
public interface GoodsRepository extends CrudRepository<Goods, String> {

    List<Goods> findAll();

    Goods findByName(String name);

    @Query("select g from Goods g where g.name like %?1%")
    List<Goods> findByNameLike(String name);
}
