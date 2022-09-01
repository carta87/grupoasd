package com.asd.back.Domain.Repository;

import com.asd.back.Domain.Dto.MaterialOffice;
import java.util.List;
import java.util.Optional;

public interface TypeRepository {
    List<MaterialOffice> getAllType();
    Optional<MaterialOffice> getType(int id);
    MaterialOffice saveType(MaterialOffice type);
    void deleteType(int typeId);
}
