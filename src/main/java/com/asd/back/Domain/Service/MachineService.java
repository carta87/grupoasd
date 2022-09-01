package com.asd.back.Domain.Service;

import com.asd.back.Domain.Dto.Machine;
import com.asd.back.Domain.Repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MachineService {

    @Autowired
    private MachineRepository machineRepository;

    public List<Machine> getAllMachine(){
        return machineRepository.getAllMachine();}

    public Optional<Machine> getMachine(int id){
        return machineRepository.getMachine(id);}

    public Machine saveMachine(Machine machine){
        return machineRepository.saveMachine(machine);}

    public boolean deleteMachine(int machineId){
        return getMachine(machineId).map(machine -> {
            machineRepository.deleteMachine(machineId);
            return true;
        }).orElse(false);
    }
}
