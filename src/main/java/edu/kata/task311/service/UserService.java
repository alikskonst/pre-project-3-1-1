package edu.kata.task311.service;

import edu.kata.task311.entity.User;

import java.util.List;

public interface UserService {

    User findOne(Long id);

    List<User> findAll();

    User save(User user);

    void remove(Long id);
}
