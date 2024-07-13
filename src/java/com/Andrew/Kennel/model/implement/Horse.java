package com.andrew.kennel.model.implement;

import com.andrew.kennel.model.AbstractPackAnimal;
import com.andrew.kennel.model.AnimalGenius;

import java.time.LocalDate;

public class Horse extends AbstractPackAnimal {
    public Horse(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.HORSE);
    }
}
