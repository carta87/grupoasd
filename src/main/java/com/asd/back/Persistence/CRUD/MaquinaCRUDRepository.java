package com.asd.back.Persistence.CRUD;

import com.asd.back.Persistence.Entity.Maquinaria;
import org.springframework.data.repository.CrudRepository;

public interface MaquinaCRUDRepository extends CrudRepository<Maquinaria, Integer> {
}
