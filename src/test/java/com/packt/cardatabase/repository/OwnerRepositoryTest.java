package com.packt.cardatabase.repository;

import com.packt.cardatabase.domain.Owner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
class OwnerRepositoryTest {
    @Autowired
    private OwnerRepository ownerRepository;

    @Test
    void saveOwner() {
        ownerRepository.save(new Owner("Lucy", "Smith"));
        assertThat(ownerRepository.findByFirstname("Lucy").isPresent()) .isTrue();
    }

    @Test
    void deleteOwners() {
        ownerRepository.save(new Owner("Lisa", "Morrison"));
        ownerRepository.deleteAll();
        assertThat(ownerRepository.count()).isEqualTo(0);
    }
}