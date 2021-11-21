package com.driypeen.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clientId;

    private String name;
    private String phoneNumber;
    private String country;
    private String city;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private List<Contract> contracts;
}
