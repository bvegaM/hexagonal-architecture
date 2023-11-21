package com.blocking.hexagonal.infrastructure.adapters.input.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    @NotNull(message = "Name could not be null")
    @NotEmpty(message = "Name could not be empty")
    private String name;

    @NotNull(message = "Age could not be null")
    private Integer age;

    @NotNull(message = "Email could not be null")
    @NotEmpty(message = "Email could not be empty")
    private String email;
}
