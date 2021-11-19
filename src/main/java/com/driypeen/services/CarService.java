package com.driypeen.services;

import com.driypeen.entities.Car;
import com.driypeen.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class CarService {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public CarRepository carRepository;

    public CarService() {};

    public Iterable<Car> findAll () {
        return carRepository.findAll();
    }
}
