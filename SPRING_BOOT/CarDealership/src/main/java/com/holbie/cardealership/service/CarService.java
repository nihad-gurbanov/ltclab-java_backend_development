package com.holbie.cardealership.service;

import com.holbie.cardealership.dto.CarDTO;
import com.holbie.cardealership.entity.Brand;
import com.holbie.cardealership.entity.Car;
import com.holbie.cardealership.repository.BrandRepository;
import com.holbie.cardealership.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {
    private final CarRepository carRepository;
    private final BrandRepository brandRepository;
    private final ModelMapper modelMapper;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }


    public void createCar(CarDTO carDTO) {
        if (carRepository.findByModel(carDTO.getModel()) != null) {
            throw new IllegalArgumentException("Car with the same model already exists");
        }
        Car car = modelMapper.map(carDTO, Car.class);
        Brand brand = brandRepository.findById(carDTO.getBrandId()).orElse(null);
        car.setBrand(brand);
        carRepository.save(car);
    }

    public void updateCar(Long id, CarDTO carDTO) {
        Car car = carRepository.findById(id).orElse(null);
        if (car != null) {
            modelMapper.map(carDTO, car);
            Brand brand = brandRepository.findById(carDTO.getBrandId()).orElse(null);
            car.setBrand(brand);
            carRepository.save(car);
        }
    }

    public List<Car> getCarsByProdYear(Integer prodYear) {
        return carRepository.findCarsByProdYear(prodYear);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }


}
