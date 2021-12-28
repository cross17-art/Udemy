package com.example.eTaskifyTaurus_1.Repository;

import com.example.eTaskifyTaurus_1.model.UserTaskify;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo extends JpaRepository<UserTaskify,Long> {

    UserTaskify findUserTaskifyByName(String name);


}
