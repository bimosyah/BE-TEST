package com.be.test.betest.helper;

import com.be.test.betest.entities.PetaniEntity;

public class ValidationHelper {
    public ValidationHelper() {
    }

    public String checkInput(PetaniEntity param){
        if (param.getNama().length() < 3 || param.getNama().length() > 50){
            return "Nama minimal 3 huruf dan tidak lebih dari 50 huruf";
        }
        if (param.getNoKtp().length() != 16){
            return "No KTP harus 16 angka";
        }
        if (param.getNoTelp().length() < 9 || param.getNama().length() > 15){
            return "No telp minimal 9 angka dan tidak lebih dari 15 angka";
        }
        return null;
    }
}
