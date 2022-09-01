package com.asd.back.Persistence;

import com.asd.back.Domain.Dto.Machine;
import com.asd.back.Domain.Repository.MachineRepository;
import com.asd.back.Persistence.CRUD.MaquinaCRUDRepository;
import com.asd.back.Persistence.Entity.Maquinaria;
import com.asd.back.Persistence.Mapper.MachineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MaquinariaRepository implements MachineRepository {

    @Autowired
    private MaquinaCRUDRepository maquinaCRUDRepository;

    @Autowired
    private MachineMapper machineMapper;

    @Override
    public List<Machine> getAllMachine() {
        List<Maquinaria> maquinarias = (List<Maquinaria>) maquinaCRUDRepository.findAll();
        return machineMapper.toListMachine(maquinarias);
    }

    @Override
    public Optional<Machine> getMachine(int id) {
        return maquinaCRUDRepository.findById(id).map(Machine -> machineMapper.toMachine(Machine));
    }

    @Override
    public Machine saveMachine(Machine machine) {
        Maquinaria maquinaria = machineMapper.toMaquinaria(machine);
        return machineMapper.toMachine(maquinaCRUDRepository.save(maquinaria));
    }

    @Override
    public void deleteMachine(int machineId) {
        maquinaCRUDRepository.deleteById(machineId);
    }
}
