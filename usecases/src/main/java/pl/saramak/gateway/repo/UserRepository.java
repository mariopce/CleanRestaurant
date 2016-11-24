package pl.saramak.gateway.repo;

import java.util.Collection;
import java.util.List;

import pl.saramak.restaurant.model.user.User;

/**
 * Created by mario on 23.11.16.
 */
public interface UserRepository {

    User createNewUser();

    List<User> findUserByName(String name);

    List<User>  getUserList();
}
