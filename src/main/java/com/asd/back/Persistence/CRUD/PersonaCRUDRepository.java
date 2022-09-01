package com.asd.back.Persistence.CRUD;

import com.asd.back.Persistence.Entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaCRUDRepository extends CrudRepository<Persona, Integer> {
}
