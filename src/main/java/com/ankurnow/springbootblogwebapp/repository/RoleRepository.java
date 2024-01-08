package com.ankurnow.springbootblogwebapp.repository;

import com.ankurnow.springbootblogwebapp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
