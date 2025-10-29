package com.example.user_crud_app.bussiness;

import com.example.user_crud_app.infrastructure.entitys.User;
import com.example.user_crud_app.infrastructure.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.saveAndFlush(user);
    }


    public User findUserByEmail(String email){
        return  repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado"));
    }

    public void deleteUserByEmail(String email){
        repository.deleteByEmail(email);
    }


}
