package com.blocking.hexagonal.infrastructure.adapters.output.repository;

import com.blocking.hexagonal.infrastructure.adapters.output.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
