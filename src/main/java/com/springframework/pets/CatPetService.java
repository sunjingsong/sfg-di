package com.springframework.pets;

import org.springframework.stereotype.Service;

//@Service("cat")
public class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
