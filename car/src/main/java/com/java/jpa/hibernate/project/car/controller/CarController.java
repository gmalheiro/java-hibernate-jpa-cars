package com.java.jpa.hibernate.project.car.controller;

import com.java.jpa.hibernate.project.car.controller.dto.CarDto;
import com.java.jpa.hibernate.project.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/v1/cars")
public class CarController {

    @Autowired
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<CarDto> createCar(@RequestBody CarDto carDto) {
        Long carId = carService.createCar(carDto);
        return ResponseEntity.created(URI.create("/v1/cars/" + carId.toString())).build();
    }

    @GetMapping("/{carId}")
    public ResponseEntity<Optional<CarDto>> findCarById(@PathVariable("carId") String carId) {
        Optional<CarDto> car = carService.findCarById(carId);
        if (car.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(car);
    }
}
