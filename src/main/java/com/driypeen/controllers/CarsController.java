package com.driypeen.controllers;

import com.driypeen.entities.Car;
import com.driypeen.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String allCars (Model model) {

        List<Car> cars = (List<Car>) carService.findAll();
        model.addAttribute("cars", cars);
        return "cars";
    }

    @GetMapping("/{id}")
    public String findCarById (@PathVariable ("id") int id,
            Model model) {

        Optional<Car> carOptional = carService.findById(id);
        Car car = carOptional.get();
        model.addAttribute("car", car);

        return "car";
    }
}
