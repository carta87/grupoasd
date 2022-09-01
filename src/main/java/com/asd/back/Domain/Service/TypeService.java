package com.asd.back.Domain.Service;

import com.asd.back.Domain.Dto.MaterialOffice;
import com.asd.back.Domain.Repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeService {

    @Autowired
    private TypeRepository typeRepository;

    public List<MaterialOffice> getAllType() {
        return typeRepository.getAllType();}

    public Optional<MaterialOffice> getType(int id) {
        return typeRepository.getType(id);
    }

    public MaterialOffice saveType(MaterialOffice type) {
        return typeRepository.saveType(type);
    }

    public boolean deleteType(int tipoId) {
        return getType(tipoId).map(type -> {
            typeRepository.deleteType(tipoId);
            return true;
        }).orElse(false);
    }
}
