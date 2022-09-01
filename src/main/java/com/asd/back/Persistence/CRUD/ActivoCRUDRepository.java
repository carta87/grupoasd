package com.asd.back.Persistence.CRUD;

import com.asd.back.Persistence.Entity.Activo;
import org.springframework.data.repository.CrudRepository;

public interface ActivoCRUDRepository extends CrudRepository<Activo, Integer> {
    //List<Activo> findByTipo(int tipo);
}