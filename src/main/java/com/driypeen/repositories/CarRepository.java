package com.driypeen.repositories;

import com.driypeen.entities.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {
    Iterable<Car> findAll();
}
