package com.packt.cardatabase.web;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.repository.CarRepository;
import com.packt.cardatabase.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;
    @GetMapping("/cars")
    public List<Car> getCars() {
        // Fetch and return cars
        return carService.getCars();
    }
}
