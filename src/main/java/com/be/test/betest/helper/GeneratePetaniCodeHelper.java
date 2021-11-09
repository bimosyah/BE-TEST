package com.be.test.betest.helper;

public class GeneratePetaniCodeHelper {
    public GeneratePetaniCodeHelper() {
    }

    public String getCode(int totalData){
        String suffix = "PTN";
        if (totalData<10){
            return suffix + "00" + totalData;
        } else if (totalData < 100){
            return suffix + "0" + totalData;
        }
        return suffix + totalData;
    }
}
