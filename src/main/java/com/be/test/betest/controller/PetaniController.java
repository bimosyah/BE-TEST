package com.be.test.betest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/petani")
public class PetaniController {

    @GetMapping(value = "checkAPI")
    public String checkApi(){
        return "Hallo";
    }

}
