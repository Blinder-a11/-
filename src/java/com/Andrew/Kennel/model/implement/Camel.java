package com.andrew.kennel.model.implement;

import com.andrew.kennel.model.AbstractPackAnimal;
import com.andrew.kennel.model.AnimalGenius;

import java.time.LocalDate;

public class Camel extends AbstractPackAnimal {
    public Camel(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.CAMEL);
    }
}
