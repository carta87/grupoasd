package com.asd.back.Persistence.CRUD;


import com.asd.back.Persistence.Entity.Activo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.Date;
import java.util.List;

public interface ActivoCRUDRepository extends CrudRepository<Activo, Integer> {
    List<Activo> findByTipo(String tipo);

    List<Activo> findByTipoEquals(String tipo);

    List<Activo> findBySerial(String serial);

    List<Activo> findAllByFechaCompra(Date date);

    List<Activo> findByFechaCompraEquals(Date date);

    @Query (value= "SELECT * FROM activo WHERE activo.tipo LIKE %:filtro%", nativeQuery = true)
    List<Activo> encontrarTipo(@Param("filtro") String tipo);

}