package com.blocking.hexagonal.infrastructure.adapters.output.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_USER")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USR_ID", unique = true, nullable = false)
    private Integer id;

    @Column(name = "USR_NAME", nullable = false)
    private String name;

    @Column(name = "USR_AGE", nullable = false)
    private Integer age;

    @Column(name = "USR_EMAIL", unique = true, nullable = false)
    private String email;

}
