package com.asd.back.Persistence.CRUD;

import com.asd.back.Persistence.Entity.Inmueble;
import org.springframework.data.repository.CrudRepository;

public interface MuebleCRUDRepository extends CrudRepository<Inmueble, Integer> {
}
