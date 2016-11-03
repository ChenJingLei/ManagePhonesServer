package app.repositories;

import app.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by cjl20 on 2016/5/15.
 */
public interface UserRepository extends CrudRepository<User, String> {

    User findOneByUsernameAndPassword(String username, String password);

    List<User> findOneByUsername(String username);
}
