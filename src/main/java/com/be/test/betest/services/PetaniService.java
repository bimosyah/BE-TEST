package com.be.test.betest.services;

import com.be.test.betest.entities.PetaniEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PetaniService {
    PetaniEntity add(PetaniEntity param);
    PetaniEntity update(PetaniEntity param);
    List<PetaniEntity> getAll();
    PetaniEntity getById(int id);
    void delete(int id);
}
