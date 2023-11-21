package com.blocking.hexagonal.application.service;

import com.blocking.hexagonal.application.ports.input.UserIPort;
import com.blocking.hexagonal.application.ports.output.UserOPort;
import com.blocking.hexagonal.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements UserIPort {

    private final UserOPort userOPort;

    @Override
    public List<User> findAll() {
        return userOPort.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userOPort.saveUser(user);
    }
}
