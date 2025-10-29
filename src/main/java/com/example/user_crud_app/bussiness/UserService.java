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


    public User findUserByEmail(String email) {
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado"));
    }

    public void deleteUserByEmail(String email) {
        repository.deleteByEmail(email);

    }

    public void updateUserByID(Integer id, User user) {
        User userEntity = repository.findById(id).orElseThrow(() ->
                new RuntimeException("User not afound"));
        User updateUser = User.builder()

                .email(user.getEmail() != null ? user.getEmail() : userEntity.getEmail())
                .name(user.getName() != null ? user.getEmail() : userEntity.getEmail())
                .id(userEntity.getId())
                .build();

    }

    //27:15

}
