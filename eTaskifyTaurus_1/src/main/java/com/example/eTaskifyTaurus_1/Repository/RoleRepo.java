package com.example.eTaskifyTaurus_1.Repository;

import com.example.eTaskifyTaurus_1.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepo extends JpaRepository<Role,Long>  {

    Role findByRole(String rolename);
}
