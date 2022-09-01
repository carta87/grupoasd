package com.asd.back.Persistence;


import com.asd.back.Domain.Dto.Possession;
import com.asd.back.Domain.Repository.FurnitureRepository;
import com.asd.back.Persistence.CRUD.MuebleCRUDRepository;
import com.asd.back.Persistence.Entity.Inmueble;
import com.asd.back.Persistence.Mapper.FurnitureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MuebleRepository implements FurnitureRepository {

    @Autowired
    private MuebleCRUDRepository muebleCRUDRepository;

    @Autowired
    private FurnitureMapper furnitureMapper;

    @Override
    public List<Possession> getAllFurniture() {
        List<Inmueble> muebles = (List<Inmueble>) muebleCRUDRepository.findAll();
        return furnitureMapper.toListFurniture(muebles);
    }

    @Override
    public Optional<Possession> getFurniture(int id) {
        return muebleCRUDRepository.findById(id).map(Possession -> furnitureMapper.toFurniture(Possession));
    }

    @Override
    public Possession saveFurniture(Possession furniture) {
        Inmueble mueble = furnitureMapper.toMueble(furniture);
        return furnitureMapper.toFurniture(muebleCRUDRepository.save(mueble));
    }

    @Override
    public void deleteFurniture(int furnitureId) {
        muebleCRUDRepository.deleteById(furnitureId);
    }
}
