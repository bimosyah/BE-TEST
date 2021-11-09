package com.be.test.betest.services;

import com.be.test.betest.entities.PetaniEntity;
import com.be.test.betest.repositories.PetaniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetaniServiceImpl implements PetaniService {

    @Autowired
    PetaniRepository petaniRepository;

    @Override
    public PetaniEntity add(PetaniEntity param) {
        return petaniRepository.save(param);
    }

    @Override
    public PetaniEntity update(PetaniEntity param) {
        return petaniRepository.save(param);
    }

    @Override
    public List<PetaniEntity> getAll() {
        return petaniRepository.findAll();
    }

    @Override
    public PetaniEntity getById(int id) {
        return petaniRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        petaniRepository.deleteById(id);
    }
}
