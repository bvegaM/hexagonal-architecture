package com.blocking.hexagonal.application.ports.output;

import com.blocking.hexagonal.domain.User;

import java.util.List;

public interface UserOPort {

    List<User> findAll();
    User saveUser(User user);

}
