package com.driypeen.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clientId;
    private String name;
    private Integer phoneNumber;
    private String country;
    private String city;
}
