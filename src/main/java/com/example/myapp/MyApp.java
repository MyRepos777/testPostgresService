package com.example.myapp;

import com.example.myapp.model.Owner;
import com.example.myapp.model.Pets;
import com.example.myapp.service.OwnerService;
import com.example.myapp.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.*;

/**
 * Created by Gudilin on 26.02.2024.
 */
@SpringBootApplication
public class MyApp {


    private final OwnerService ownerService;
    private final PetService petService;


    @Autowired
    public MyApp(OwnerService ownerService, PetService petService) {
        this.ownerService = ownerService;
        this.petService = petService;
    }
}