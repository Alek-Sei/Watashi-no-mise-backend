package com.onex.watashinomise.repository;

import com.onex.watashinomise.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query("FROM Role WHERE name=:name")
    Role findByUsername(@Param("name") String name);
}