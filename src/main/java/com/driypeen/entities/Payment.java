package com.driypeen.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name="payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentTime;

    private String type;
    private Double sum;

    @OneToMany(mappedBy = "payment", fetch = FetchType.EAGER)
    private List<Contract> contracts;
}
