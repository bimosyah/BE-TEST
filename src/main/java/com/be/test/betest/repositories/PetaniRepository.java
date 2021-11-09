package com.be.test.betest.repositories;

import com.be.test.betest.entities.PetaniEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetaniRepository extends JpaRepository<PetaniEntity, Integer> {

    @Query(value = "SELECT * FROM petani WHERE nama LIKE %:search%", nativeQuery = true)
    List<PetaniEntity> searchByName(@Param("search") String search);

    @Query(value = "SELECT * FROM petani WHERE code LIKE %:search%", nativeQuery = true)
    List<PetaniEntity> searchByCode(@Param("search") String search);
}
