package com.be.test.betest.controller;

import com.be.test.betest.entities.PetaniEntity;
import com.be.test.betest.repositories.PetaniRepository;
import com.be.test.betest.response.CommonResponse;
import com.be.test.betest.response.CommonResponseGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/petani")
public class PetaniController {

    @Autowired
    PetaniRepository petaniRepository;

    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @GetMapping(value = "checkAPI")
    public CommonResponse<String> checkApi(){
        return commonResponseGenerator.successResponse("test","Sukses api");
    }

    @PostMapping(value = "add")
    public CommonResponse<PetaniEntity> add(@RequestBody PetaniEntity param){
        petaniRepository.save(param);
        return commonResponseGenerator.successResponse(param,"sukses");
    }

    @GetMapping(value = "getAll")
    public CommonResponse<List<PetaniEntity>> getAllPetani(){
        return commonResponseGenerator.successResponse(petaniRepository.findAll(),"sukksess");
    }

    @GetMapping(value = "getById")
    public CommonResponse<PetaniEntity> getById(@RequestParam int id){
        return commonResponseGenerator.successResponse(petaniRepository.findById(id).get(),"suksess");
    }

    @PutMapping(value = "update")
    public CommonResponse<PetaniEntity> updatePetani(@RequestBody PetaniEntity param){
        return commonResponseGenerator.successResponse(petaniRepository.save(param), "sukses");
    }

    @DeleteMapping(value = "delete")
    public CommonResponse<String> delete(@RequestParam int id){
        petaniRepository.deleteById(id);
        return commonResponseGenerator.successResponse("","success delete car id: "+ id);
    }

}
