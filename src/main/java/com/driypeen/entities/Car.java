package com.driypeen.entities;

import javax.persistence.*;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Data
@Entity
@Table(name = "Cars")
public class Car implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carId;

    @OneToMany(mappedBy = "car", fetch = FetchType.EAGER)
    private List<Contract> contracts;

    private String manufacturer;
    private String model;
    private Double costPerHour;
    private Double costPerDay;
    private String status;
    private Date productionYear;
    private String description;
    private String photos;


}
