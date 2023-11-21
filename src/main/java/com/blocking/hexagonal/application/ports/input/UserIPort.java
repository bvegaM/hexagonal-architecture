package com.blocking.hexagonal.application.ports.input;

import com.blocking.hexagonal.domain.User;

import java.util.List;

public interface UserIPort {

    List<User> findAll();

    User saveUser(User user);
}
