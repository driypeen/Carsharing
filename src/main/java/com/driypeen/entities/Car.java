package com.driypeen.entities;

import javax.persistence.*;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "Cars")
public class Car implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carId;

    private String manufacturer;
    private String model;
    private Double costPerHour;
    private Double costPerDay;
    private String status;
    private Date productionYear;
    private String description;
    private String photos;


}
