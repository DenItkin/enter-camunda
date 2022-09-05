package com.sytoss.camunda_react_web.entity;

import lombok.*;

import javax.persistence.*;
import java.math.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_vehicle")
    private Long id;
    @Column(name = "model")
    private String model;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "description")
    private String description;
}
