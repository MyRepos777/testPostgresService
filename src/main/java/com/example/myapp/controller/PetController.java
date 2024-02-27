package com.example.myapp.controller;

/**
 * Created by Gudilin on 26.02.2024.
 */
import com.example.myapp.model.Pets;
import com.example.myapp.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




import java.util.List;


@RestController
@RequestMapping("/pets")
public class PetController {


    private final PetService petService;


    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }


    @GetMapping
    public List<Pets> getAllPets() {
        return petService.getAllPets();
    }


    @GetMapping("/{id}")
    public Pets getPetById(@PathVariable Long id) {
        return petService.getPetById(id);
    }


    @PostMapping
    public Pets createPet(@RequestBody Pets pet) {
        return petService.createPet(pet);
    }


    @PutMapping("/{id}")
    public Pets updatePet(@PathVariable Long id, @RequestBody Pets pet) {
        pet.setId(id);
        return petService.updatePet(pet);
    }


    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable Long id) {
        petService.deletePet(id);
    }
}
