package com.driypeen.repositories;

import com.driypeen.entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    Iterable<Client> findAll();
}
