package com.example.eTaskifyTaurus_1.Service;

import com.example.eTaskifyTaurus_1.Repository.OrganizationRepo;
import com.example.eTaskifyTaurus_1.Repository.RoleRepo;
import com.example.eTaskifyTaurus_1.Repository.UserRepo;
import com.example.eTaskifyTaurus_1.model.Organization;
import com.example.eTaskifyTaurus_1.model.UserTaskify;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@RequiredArgsConstructor
@AllArgsConstructor
@Transactional
@Slf4j
public class UserService implements ServiceImplimetnsTaskify {

    private UserRepo userRepo;
    private RoleRepo roleRepo;
    private OrganizationRepo organizationRepo;


    @Override
    public UserTaskify saveUser(UserTaskify userTaskify) {
        return userRepo.save(userTaskify);
    }

    @Override
    public UserTaskify getUser(String userName) {
        return userRepo.findUserTaskifyByName(userName);
    }

    @Override
    public List<UserTaskify> getUsers() {
        List<UserTaskify> users=userRepo.findAll();
        System.out.println(
                List.of(users)
        );
        return userRepo.findAll();
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

    }

    @Override
    public Organization saveOrganization(Organization organization) {
        return organizationRepo.save(organization);
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
