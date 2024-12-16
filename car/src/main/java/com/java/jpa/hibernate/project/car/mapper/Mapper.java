package com.java.jpa.hibernate.project.car.mapper;

import com.java.jpa.hibernate.project.car.controller.dto.CarDto;
import com.java.jpa.hibernate.project.car.entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Mapper {

    public Car toEntity(CarDto dto) {
        return new Car(dto.brand(), dto.name(), dto.launchYear(), dto.model());
    }

    public List<CarDto> toDto(List<Car> list) {
        ArrayList<CarDto> dtoList = new ArrayList<>();
        list.forEach(car -> dtoList.add(new CarDto(
                car.getBrand(),
                car.getName(),
                car.getLaunchYear(),
                car.getModel())));
        return dtoList;
    }

    public Optional<CarDto> toDto(Optional<Car> car) {
        return car.map(c -> new CarDto(
                c.getBrand(),
                c.getName(),
                c.getLaunchYear(),
                c.getModel()
        ));
    }
}
