package com.driypeen.repositories;

import com.driypeen.entities.Contract;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends CrudRepository<Contract, Long> {
    Iterable<Contract> findAll();
}
