package com.packt.cardatabase.repository;

import com.packt.cardatabase.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    Optional<Owner> findByFirstname(String firstName);
}
