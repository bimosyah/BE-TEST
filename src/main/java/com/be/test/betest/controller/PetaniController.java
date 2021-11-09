package com.be.test.betest.controller;

import com.be.test.betest.entities.PetaniEntity;
import com.be.test.betest.helper.GeneratePetaniCodeHelper;
import com.be.test.betest.helper.ValidationHelper;
import com.be.test.betest.repositories.PetaniRepository;
import com.be.test.betest.response.CommonResponse;
import com.be.test.betest.response.CommonResponseGenerator;
import com.be.test.betest.services.PetaniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api")
public class PetaniController {

    @Autowired
    PetaniRepository petaniRepository;

    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @Autowired
    PetaniService petaniService;

    ValidationHelper validationHelper;

    @PostMapping(value = "petani")
    public CommonResponse<PetaniEntity> add(@RequestBody PetaniEntity param){
        validationHelper = new ValidationHelper();
        if (validationHelper.checkInput(param) != null){
            return commonResponseGenerator.failResponse(validationHelper.checkInput(param));
        }

        GeneratePetaniCodeHelper helper = new GeneratePetaniCodeHelper();
        int code = petaniService.totalData();
        param.setCode(helper.getCode(code));
        return commonResponseGenerator.successResponse(petaniService.add(param),"sukses");
    }

    @GetMapping(value = "petani")
    public CommonResponse<List<PetaniEntity>> getAllPetani(){
        return commonResponseGenerator.successResponse(petaniService.getAll(),"sukksess");
    }

    @GetMapping(value = "petani/{id}")
    public CommonResponse<PetaniEntity> getById(@PathVariable("id") int id ){
        return commonResponseGenerator.successResponse(petaniService.getById(id),"suksess");
    }

    @PutMapping(value = "petani")
    public CommonResponse<PetaniEntity> updatePetani(@RequestBody PetaniEntity param){
        return commonResponseGenerator.successResponse(petaniService.update(param), "sukses");
    }

    @DeleteMapping(value = "petani/{id}")
    public CommonResponse<String> delete(@PathVariable("id") int id){
        petaniService.delete(id);
        return commonResponseGenerator.successResponse("","success delete car id: "+ id);
    }

}
