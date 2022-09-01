package com.asd.back.Domain.Repository;

import com.asd.back.Domain.Dto.Position;
import java.util.List;
import java.util.Optional;

public interface PositionRepository {
    List<Position> getAllPosition();
    Optional<Position> getPosition(int id);
    Position savePosition(Position position);
    void deletePosition(int positionId);
}
