package com.example.eTaskifyTaurus_1.Service;

//import com.example.eTaskifyTaurus_1.model.Role;
import com.example.eTaskifyTaurus_1.model.Organization;
import com.example.eTaskifyTaurus_1.model.Role;
import com.example.eTaskifyTaurus_1.model.UserTaskify;

import java.util.List;

public interface ServiceImplimetnsTaskify {

    UserTaskify saveUser(UserTaskify userTaskify);

    UserTaskify getUser(String userName);

    List<UserTaskify> getUsers();

    void addRoleToUser(String username, String roleName);

    Organization saveOrganization(Organization organization);
}
