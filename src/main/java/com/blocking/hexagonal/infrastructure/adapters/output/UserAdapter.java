package com.blocking.hexagonal.infrastructure.adapters.output;

import com.blocking.hexagonal.application.ports.output.UserOPort;
import com.blocking.hexagonal.domain.User;
import com.blocking.hexagonal.infrastructure.adapters.output.entity.UserEntity;
import com.blocking.hexagonal.infrastructure.adapters.output.mapper.UserEntityMapper;
import com.blocking.hexagonal.infrastructure.adapters.output.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class UserAdapter implements UserOPort {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    @Override
    public List<User> findAll() {
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntityMapper.toUsers(userEntities);
    }

    @Override
    public User saveUser(User user) {
        UserEntity userEntity = userEntityMapper.toUserEntity(user);
        return userEntityMapper.toUser(userRepository.save(userEntity));
    }
}
