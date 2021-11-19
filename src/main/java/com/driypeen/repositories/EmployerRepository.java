package com.driypeen.repositories;

import com.driypeen.entities.Client;
import com.driypeen.entities.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends CrudRepository<Employer, Long> {
    Iterable<Employer> findAll();
}
