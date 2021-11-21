package com.driypeen.services;

import com.driypeen.entities.Car;
import com.driypeen.entities.Contract;
import com.driypeen.repositories.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Service
public class ContractService {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public ContractRepository contractRepository;

    public ContractService () {};

    public Iterable<Contract> findAll () {
        return contractRepository.findAll();
    }

    public Optional<Contract> findByContractId (int id) {
        return contractRepository.findByContractId(id);
    }

}
