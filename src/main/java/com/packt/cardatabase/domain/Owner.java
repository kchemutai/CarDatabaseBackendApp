package com.packt.cardatabase.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Owner {
    @Id
    @GeneratedValue
    private Long ownerid;
    private String firstname, lastname;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Car> cars;
    public Owner(String firstname, String lastname) {
        this.firstname = firstname; this.lastname = lastname;
    }
}
