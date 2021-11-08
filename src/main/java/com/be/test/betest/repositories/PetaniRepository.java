package com.be.test.betest.repositories;

import com.be.test.betest.entities.PetaniEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetaniRepository extends JpaRepository<PetaniEntity, Integer> {
}
