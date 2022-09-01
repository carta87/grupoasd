package com.asd.back.Persistence.CRUD;

import com.asd.back.Persistence.Entity.Cargo;
import org.springframework.data.repository.CrudRepository;

public interface CargoCRUDRepository extends CrudRepository<Cargo, Integer> {
	//comentario
}