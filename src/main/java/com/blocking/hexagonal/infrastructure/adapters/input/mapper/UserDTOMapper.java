package com.blocking.hexagonal.infrastructure.adapters.input.mapper;

import com.blocking.hexagonal.domain.User;
import com.blocking.hexagonal.infrastructure.adapters.input.dto.UserDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserDTOMapper {

    UserDTO toUserDTO(User user);
    List<UserDTO> toUserDTOs(List<User> users);

    @InheritInverseConfiguration
    @Mapping(target = "id", ignore = true)
    User toUser(UserDTO userDTO);
}
