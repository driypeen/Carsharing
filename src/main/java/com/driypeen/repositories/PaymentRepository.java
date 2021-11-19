package com.driypeen.repositories;

import com.driypeen.entities.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {
    Iterable<Payment> findAll();
}
