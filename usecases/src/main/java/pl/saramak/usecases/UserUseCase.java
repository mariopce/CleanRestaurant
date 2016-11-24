package pl.saramak.usecases;

import java.util.List;

import pl.saramak.gateway.repo.UserRepository;
import pl.saramak.restaurant.model.user.User;


public class UserUseCase {

    UserRepository userRepository;

    public UserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createNewUser(){
        return userRepository.createNewUser();
    }

    public List<User> findUserByName(String name){
        return userRepository.findUserByName(name);
    }

    public boolean isAnyUserRegisteredOnDevice() {
        return userRepository.getUserList().size() > 0;
    }
}
