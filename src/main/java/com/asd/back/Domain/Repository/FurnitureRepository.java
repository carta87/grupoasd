package com.asd.back.Domain.Repository;

import com.asd.back.Domain.Dto.Possession;
import java.util.List;
import java.util.Optional;

public interface FurnitureRepository {
    List<Possession> getAllFurniture();
    Optional<Possession> getFurniture(int id);
    Possession saveFurniture(Possession furniture);
    void deleteFurniture(int furnitureId);
}
