package pl.saramak.restaurant.android;

import android.content.Context;

import java.util.List;

import pl.saramak.gateway.repo.UserRepository;
import pl.saramak.restaurant.model.user.User;

public class OrmUserRepository implements UserRepository {
    private Context context;

    public OrmUserRepository(Context context) {

        this.context = context;
    }

    @Override
    public User createNewUser() {
        return null;
    }

    @Override
    public List<User> findUserByName(String name) {
        return null;
    }
}
