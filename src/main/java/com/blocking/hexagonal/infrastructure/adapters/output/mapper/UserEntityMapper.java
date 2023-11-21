package com.blocking.hexagonal.infrastructure.adapters.output.mapper;

import com.blocking.hexagonal.domain.User;
import com.blocking.hexagonal.infrastructure.adapters.output.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {

    User toUser(UserEntity userEntity);
    List<User> toUsers(List<UserEntity> userEntities);

    UserEntity toUserEntity(User user);
}
