package com.asd.back.Domain.Service;

import com.asd.back.Domain.Dto.Position;
import com.asd.back.Domain.Repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionService   {

    @Autowired
    private PositionRepository positionRepository;

    public List<Position> getAllPosition(){return positionRepository.getAllPosition();}

    public Optional<Position> getPosition(int id){
        return positionRepository.getPosition(id);}

    public Position savePosition(Position position) {
        return positionRepository.savePosition(position);
    }

    public boolean deletePosition(int positionId) {
        return getPosition(positionId).map(position -> {
            positionRepository.deletePosition(positionId);
            return true;
        }).orElse(false);
    }
}
