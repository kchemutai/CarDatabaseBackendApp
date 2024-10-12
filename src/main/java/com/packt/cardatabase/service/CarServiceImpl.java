package com.packt.cardatabase.service;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService{
    private final CarRepository carRepository;

    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }
}
