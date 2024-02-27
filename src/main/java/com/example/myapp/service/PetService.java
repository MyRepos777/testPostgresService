package com.example.myapp.service;

/**
 * Created by Gudilin on 26.02.2024.
 */
import com.example.myapp.model.Pets;
import com.example.myapp.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class PetService {


    private final PetRepository petRepository;


    @Autowired
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }


    public List<Pets> getAllPets() {
        return petRepository.findAll();
    }


    public Pets getPetById(Long id) {
        return petRepository.findById(id).orElse(null);
    }


    /*тест коммит*/
    public Pets createPet(Pets pet) {
        return petRepository.save(pet);
    }


    public Pets updatePet(Pets pet) {
        return petRepository.save(pet);
    }


    public void deletePet(Long id) {
        petRepository.deleteById(id);
    }
}