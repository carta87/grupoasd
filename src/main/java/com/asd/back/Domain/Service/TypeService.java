package com.asd.back.Domain.Service;

import com.asd.back.Domain.Repository.TypeRepository;
import com.asd.back.Domain.Dto.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeService {

    @Autowired
    private TypeRepository typeRepository;

    public List<Type> getAllType() {
        return typeRepository.getAllType();}

    public Optional<Type> getType(int id) {
        return typeRepository.getType(id);
    }

    public Type saveType(Type type) {
        return typeRepository.saveType(type);
    }

    public boolean deleteType(int tipoId) {
        return getType(tipoId).map(type -> {
            typeRepository.deleteType(tipoId);
            return true;
        }).orElse(false);
    }
}
