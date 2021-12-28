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
@Table(name = "Organization")
public class Organization {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String organizationName;
    private String phone;
    private String address;

    @ManyToMany(fetch = FetchType.EAGER)
    @Column(name = "UserTaskify")
    private Collection<UserTaskify> UserTaskify = new ArrayList<>();


}
