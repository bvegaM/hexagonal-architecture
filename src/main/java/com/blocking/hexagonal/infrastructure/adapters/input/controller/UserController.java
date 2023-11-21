package com.blocking.hexagonal.infrastructure.adapters.input.controller;

import com.blocking.hexagonal.application.ports.input.UserIPort;
import com.blocking.hexagonal.domain.User;
import com.blocking.hexagonal.infrastructure.adapters.input.dto.UserDTO;
import com.blocking.hexagonal.infrastructure.adapters.input.mapper.UserDTOMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserIPort userIPort;
    private final UserDTOMapper userDTOMapper;


    @GetMapping()
    public ResponseEntity<List<UserDTO>> findAll(){
        List<User> users = userIPort.findAll();
        return ResponseEntity.ok().body(userDTOMapper.toUserDTOs(users));
    }

    @PostMapping()
    public ResponseEntity<UserDTO> save(@Valid @RequestBody UserDTO userDTO){
        User user = userIPort.saveUser(userDTOMapper.toUser(userDTO));
        return new ResponseEntity<>(userDTOMapper.toUserDTO(user), HttpStatus.CREATED);
    }
}
