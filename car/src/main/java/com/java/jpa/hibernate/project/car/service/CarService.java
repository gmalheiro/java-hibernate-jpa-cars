package com.java.jpa.hibernate.project.car.service;

import com.java.jpa.hibernate.project.car.controller.dto.CarDto;
import com.java.jpa.hibernate.project.car.entity.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    Long createCar(CarDto car);
    Optional<CarDto> findCarById(String carId);
    List<CarDto> listCars();
    void updateCarById(Long id,Car car);
    void deleteCarById(Long id);
}
