package com.java.jpa.hibernate.project.car.entity;

import com.java.jpa.hibernate.project.car.entity.enums.CarEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "car", indexes = @Index(name = "idx_brand",columnList = "brand"))
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CarEnum model;

    @Column(nullable = false)
    private String brand;

    @Column(length = 4, nullable = false)
    private String launchYear;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
