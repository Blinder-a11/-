package com.andrew.kennel.model.implement;

import com.andrew.kennel.model.AbstractPet;
import com.andrew.kennel.model.AnimalGenius;

import java.time.LocalDate;

public class Hamster extends AbstractPet {
    public Hamster(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.HAMSTER);
    }
}
