package com.asd.back.Domain.Repository;

import com.asd.back.Domain.Dto.Type;
import java.util.List;
import java.util.Optional;

public interface TypeRepository {
    List<Type> getAllType();
    Optional<Type> getType(int id);
    Type saveType(Type type);
    void deleteType(int typeId);
}
