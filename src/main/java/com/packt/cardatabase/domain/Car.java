package com.packt.cardatabase.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private String brand, model, color, registerNumber;
    private int modelYear, price;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "owner")
    private Owner owner;

    public Car(String brand, String model, String color, String registerNumber, int modelYear, int price, Owner owner) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.modelYear = modelYear;
        this.price = price;
        this.owner = owner;
    }
}
