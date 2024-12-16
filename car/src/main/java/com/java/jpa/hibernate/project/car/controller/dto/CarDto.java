package com.java.jpa.hibernate.project.car.controller.dto;

import com.java.jpa.hibernate.project.car.entity.enums.CarEnum;

public record CarDto(String brand, String name, String launchYear, CarEnum model) { }
