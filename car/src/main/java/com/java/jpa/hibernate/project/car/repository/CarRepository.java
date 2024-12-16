package com.java.jpa.hibernate.project.car.repository;

import com.java.jpa.hibernate.project.car.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
