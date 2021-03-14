package springframework.pets.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springframework.pets.service.PetService;

//@Profile("cat")
//@Service
public class DogPetService implements PetService {

    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
