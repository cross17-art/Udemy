package com.example.eTaskifyTaurus_1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "UserTaskify")
public class UserTaskify {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String password;
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles  = new ArrayList<>();

}
