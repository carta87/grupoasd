package com.asd.back.Persistence.CRUD;

import com.asd.back.Persistence.Entity.Tipo;
import org.springframework.data.repository.CrudRepository;

public interface TipoCRUDRepository  extends CrudRepository<Tipo, Integer> {
}
