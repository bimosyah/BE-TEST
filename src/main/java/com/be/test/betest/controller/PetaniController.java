package com.be.test.betest.controller;

import com.be.test.betest.entities.PetaniEntity;
import com.be.test.betest.repositories.PetaniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/petani")
public class PetaniController {

    @Autowired
    PetaniRepository petaniRepository;

    @GetMapping(value = "checkAPI")
    public String checkApi(){
        return "Hallo";
    }

    @PostMapping(value = "add")
    public String add(@RequestBody PetaniEntity param){
        petaniRepository.save(param);
        return "suksess";
    }
}
