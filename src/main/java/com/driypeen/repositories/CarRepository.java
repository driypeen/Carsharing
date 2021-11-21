package com.driypeen.repositories;

import com.driypeen.entities.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    Iterable<Car> findAll();
    Optional<Car> findByCarId (Integer id);
}
