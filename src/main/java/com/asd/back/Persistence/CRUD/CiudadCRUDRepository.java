package com.asd.back.Persistence.CRUD;

import com.asd.back.Persistence.Entity.Ciudad;
import org.springframework.data.repository.CrudRepository;

public interface CiudadCRUDRepository extends CrudRepository<Ciudad, Integer> {
}