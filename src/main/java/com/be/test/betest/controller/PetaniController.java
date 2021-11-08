package com.be.test.betest.controller;

import com.be.test.betest.entities.PetaniEntity;
import com.be.test.betest.repositories.PetaniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public PetaniEntity add(@RequestBody PetaniEntity param){
        petaniRepository.save(param);
        return param;
    }

    @GetMapping(value = "getAll")
    public List<PetaniEntity> getAllPetani(){
        return petaniRepository.findAll();
    }

    @GetMapping(value = "getById")
    public PetaniEntity getById(@RequestParam int id){
        return petaniRepository.findById(id).get();
    }

    @PutMapping(value = "update")
    public PetaniEntity updatePetani(@RequestBody PetaniEntity param){
        return petaniRepository.save(param);
    }

    @DeleteMapping(value = "delete")
    public String delete(@RequestParam int id){
        petaniRepository.deleteById(id);
        return "success delete car id: " + id;
    }

}
