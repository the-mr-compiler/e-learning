package com.msoft.elearning.repositories;

import com.msoft.elearning.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users,Long> {
    Optional<Users> findByUsername(String username);
    Boolean existsByUsername(String username);
}
