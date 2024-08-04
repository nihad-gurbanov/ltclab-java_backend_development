package com.holbie.cardealership.controller;

import com.holbie.cardealership.dto.CarDTO;
import com.holbie.cardealership.entity.Car;
import com.holbie.cardealership.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/all")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/id/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @GetMapping("/prodYear/{prodYear}")
    public List<Car> getCarsByProdYear(@PathVariable Integer prodYear) {
        return carService.getCarsByProdYear(prodYear);
    }

    @PostMapping("/create")
    public String createCar(CarDTO carDTO) {
        try {
            carService.createCar(carDTO);
            return "Car created successfully";
        }
        catch (IllegalArgumentException e) {
            return e.getMessage();
        }

    }

    @PutMapping("/update/{id}")
    public String updateCar(@PathVariable Long id, CarDTO carDTO) {
        carService.updateCar(id, carDTO);
        return "Car updated successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return "Car deleted successfully";
    }
}
