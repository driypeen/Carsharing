package com.driypeen.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="contracts")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carID;
    private Integer clientID;

    @Temporal(TemporalType.TIMESTAMP)
    private Date beginTime;

    private Date endTime;
    private Integer paymentID;
    private Integer employerID;

}
