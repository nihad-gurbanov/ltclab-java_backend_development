package com.ltc.espiritspringboot.controller;

import com.ltc.espiritspringboot.dto.CarDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    List<CarDto> allCarDto = new ArrayList<CarDto>();

    @GetMapping("getAll")
    public List<CarDto> getAll() {
        return allCarDto;
    }

    @PostMapping("/create")
    public String createCar(@RequestBody CarDto carDto) {
        allCarDto.add(carDto);
        return "Car created successfully";
    }

    @PostMapping("/createAll")
    public String createAllCars(@RequestBody List<CarDto> carDtos) {
        allCarDto.addAll(carDtos);
        return "Cars created successfully";
    }

    @DeleteMapping("/delete{id}")
    public String deleteCar(@PathVariable Long id) {
        allCarDto.removeIf(car -> car.getId().equals(id));

        return "Car deleted successfully";
    }

    @PutMapping("/update{id}")
    public String updateCar(@PathVariable Long id, @RequestBody CarDto carDto) {
        for (CarDto car : allCarDto) {
            if (car.getId().equals(id)) {
                car.setId(carDto.getId());
                car.setCarName(carDto.getCarName());
                car.setCarYear(carDto.getCarYear());
            }
        }
        return "Car updated successfully";
    }

}
