package com.asd.back.Persistence;

import com.asd.back.Domain.Dto.Position;
import com.asd.back.Domain.Repository.PositionRepository;
import com.asd.back.Persistence.CRUD.CargoCRUDRepository;
import com.asd.back.Persistence.Entity.Cargo;
import com.asd.back.Persistence.Mapper.PositionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CargoRepository implements PositionRepository {

    @Autowired
    private CargoCRUDRepository cargoCRUDRepository;

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public List<Position> getAllPosition() {
        List<Cargo> cargos = (List<Cargo>) cargoCRUDRepository.findAll();
        return positionMapper.toListPosition(cargos);
    }

    @Override
    public Optional<Position> getPosition(int id) {
        return cargoCRUDRepository.findById(id).map(Position -> positionMapper.toPosition(Position));
    }

    @Override
    public Position savePosition(Position position) {
        Cargo cargo = positionMapper.toCargo(position);
        return positionMapper.toPosition(cargoCRUDRepository.save(cargo));
    }

    @Override
    public void deletePosition(int positionId) {
        cargoCRUDRepository.deleteById(positionId);
    }
}
