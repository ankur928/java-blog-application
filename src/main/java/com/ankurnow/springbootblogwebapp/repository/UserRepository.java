package com.ankurnow.springbootblogwebapp.repository;

import com.ankurnow.springbootblogwebapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
