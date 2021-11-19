package com.driypeen.controllers;

import com.driypeen.entities.Car;
import com.driypeen.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarsController {
    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping ("/cars")
    public String carPage (
            //@RequestParam(value = "id", required = false) String id,
            Model model) {
        //int carID = Integer.parseInt(id);
        //model.addAttribute("id", carID);

        List<Car> cars = (List<Car>) carService.findAll();
        model.addAttribute("cars", cars);
        return "cars";
    }
}
