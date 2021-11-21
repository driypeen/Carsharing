package com.driypeen.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="employers")
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employerId;

    private String firstName;
    private String secondName;
    private String patronymic;
    private Double salary;
    private String phoneNumber;

    @OneToMany(mappedBy = "employer", fetch = FetchType.EAGER)
    private List<Contract> contracts;
}
