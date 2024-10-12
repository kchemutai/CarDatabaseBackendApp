package com.packt.cardatabase.repository;

import com.packt.cardatabase.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    public List<Car> findByBrand(@Param("brand") String brand);
    public List<Car> findByColor(@Param("color") String color);
    public List<Car> findByModel(String model);
    public List<Car> findByModelYear(int modelYear);
    public List<Car> findByBrandAndModel(String brand, String model);
    public List<Car> findByModelAndModelYear(String model, int modelYear);
    public List<Car> findByBrandOrModel(String brand, String model);
}
