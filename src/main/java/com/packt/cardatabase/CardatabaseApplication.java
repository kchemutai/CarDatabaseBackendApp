package com.packt.cardatabase;

import com.packt.cardatabase.repository.AppUserRepository;
import com.packt.cardatabase.repository.CarRepository;
import com.packt.cardatabase.repository.OwnerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class CardatabaseApplication implements CommandLineRunner {
	public final CarRepository carRepository;
	private final OwnerRepository ownerRepository;
	private final AppUserRepository appUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

//		Owner owner1 = new Owner("John" , "Johnson");
//		Owner owner2 = new Owner("Mary" , "Robinson");
//		ownerRepository.saveAll(Arrays.asList(owner1, owner2));
//
//		carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2023, 59000, owner1));
//		carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2020, 29000, owner2));
//		carRepository.save(new Car("Toyota", "Prius", "Silver","KKO-0212", 2022, 39000, owner2));
//
//		// Fetch all cars and log to console
//		for (Car car : carRepository.findAll()) {
//			log.info(car.getBrand() + " " + car.getModel());
//		}
//
//		// Username: user, password: pass
//		appUserRepository.save(
//				new AppUser("user",
//				"$2y$10$sRmieU8nzN5eJuLNJdffneiFF2s6GiyfxaERaXcPR1WXQ.m2MNt8C",
//						"USER"
//				));
//		// Username: admin, password: letmein
//		appUserRepository.save(
//				new AppUser(
//						"admin",
//						"$2y$10$EVv7QcmfN64PAqcyspBIP.0dQqqNxPxOkjB.yFQAqQ2tOkRZ.amFu",
//						"ADMIN"
//				));
	}
}
