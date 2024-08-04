package com.holbie.cardealership.repository;

import com.holbie.cardealership.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    @Query("SELECT c FROM Car c WHERE c.prodYear = :prodYear")
    List<Car> findCarsByProdYear(@Param("prodYear") Integer prodYear);

    @Query("SELECT c FROM Car c WHERE c.model = :model")
    Car findByModel(@Param("model") String model);

}
