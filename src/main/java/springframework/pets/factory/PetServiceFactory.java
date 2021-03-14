package springframework.pets.factory;

import springframework.pets.service.PetService;
import springframework.pets.service.impl.CatPetService;
import springframework.pets.service.impl.DogPetService;

public class PetServiceFactory {


    public PetService getPetService(String petType){

        switch(petType){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }


}
