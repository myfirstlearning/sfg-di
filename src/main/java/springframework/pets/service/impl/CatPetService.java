package springframework.pets.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springframework.pets.service.PetService;

//@Profile({"dog","default"})
//@Service
public class CatPetService implements PetService {

    @Override
    public String getPetType() {
        return "Cats are the best!";
    }
}
