package com.asd.back.Persistence.CRUD;

import com.asd.back.Persistence.Entity.Area;
import org.springframework.data.repository.CrudRepository;

public interface CargoCRUDRepository extends CrudRepository<Area, Integer> {
	//comentario
}