package com.driypeen.controllers;

import com.driypeen.entities.Car;
import com.driypeen.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String showAllCars (Model model) {

        List<Car> cars = (List<Car>) carService.findAll();
        model.addAttribute("cars", cars);
        return "cars";
    }

    @GetMapping("/{id}")
    public String findCarById (@PathVariable ("id") int id,
            Model model) {

        Optional<Car> carOptional = carService.findByCarId(id);

        if (carOptional.isPresent()) {
            Car car = carOptional.get();
            model.addAttribute("car", car);
        } else {
            //error
        }

        return "car";
    }
}
