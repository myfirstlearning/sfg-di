package springframework.pets.controller;

import org.springframework.stereotype.Controller;
import springframework.pets.service.PetService;

@Controller
public class PetController {


    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String getPetType(){
        return petService.getPetType();
    }


}
