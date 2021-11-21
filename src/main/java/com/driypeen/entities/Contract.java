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
    private Integer contractId;

    @ManyToOne()
    @JoinColumn(name = "cars_car_id")
    private Car car;

    @ManyToOne()
    @JoinColumn(name = "clients_client_id")
    private Client client;

    @ManyToOne()
    @JoinColumn(name = "payments_payment_id")
    private Payment payment;

    @ManyToOne()
    @JoinColumn(name = "employers_employer_id")
    private Employer employer;

    @Temporal(TemporalType.TIMESTAMP)
    private Date beginTime;

    private Date endTime;
}
