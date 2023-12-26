package com.training.AngularSpring.repository;


import com.training.AngularSpring.model.request.CreateUserRequestModel;
import com.training.AngularSpring.model.request.UserRequestModel;
import org.springframework.data.repository.CrudRepository;
import com.training.AngularSpring.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findAll();

    User findById(int id);

    void delete(User user);

    User save(UserRequestModel user);

    User save(CreateUserRequestModel user);
}