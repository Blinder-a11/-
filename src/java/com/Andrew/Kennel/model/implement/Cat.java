package com.andrew.kennel.model.implement;

import com.andrew.kennel.model.AbstractPet;
import com.andrew.kennel.model.AnimalGenius;

import java.time.LocalDate;

public class Cat extends AbstractPet {
    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.CAT);
    }
}
