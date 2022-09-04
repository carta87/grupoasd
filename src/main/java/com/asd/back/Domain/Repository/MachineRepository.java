package com.asd.back.Domain.Repository;

import com.asd.back.Domain.Dto.Machine;
import java.util.List;
import java.util.Optional;

public interface MachineRepository {
    List<Machine> getAllMachine();
    Optional<Machine> getMachine(int id);
    Machine saveMachine(Machine machine);
    void deleteMachine(int machineId);
}
