package com.java.jpa.hibernate.project.car.service;

import com.java.jpa.hibernate.project.car.controller.dto.CarDto;
import com.java.jpa.hibernate.project.car.entity.Car;
import com.java.jpa.hibernate.project.car.mapper.Mapper;
import com.java.jpa.hibernate.project.car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarRepository repository;

    Mapper mapper;

    public CarServiceImpl(CarRepository repository, Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public Long createCar(CarDto car) {
        Car entity = mapper.toEntity(car);
        Car entitySaved = repository.save(entity);
        return entitySaved.getId();
    }

    @Override
    public Optional<CarDto> findCarById(String carId) {
        Optional<Car> entity = repository.findById(Long.parseLong(carId));
        return  mapper.toDto(entity);
    }

    @Override
    public List<CarDto> listCars() {
        List<Car> carsList = repository.findAll();
        return mapper.toDto(carsList);
    }

    @Override
    public void updateCarById(Long id, Car car) {

    }

    @Override
    public void deleteCarById(Long id) {

    }
}
