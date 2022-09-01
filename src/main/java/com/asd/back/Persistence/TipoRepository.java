package com.asd.back.Persistence;

import com.asd.back.Domain.Repository.TypeRepository;
import com.asd.back.Domain.Dto.Type;
import com.asd.back.Persistence.CRUD.TipoCRUDRepository;
import com.asd.back.Persistence.Entity.Tipo;
import com.asd.back.Persistence.Mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TipoRepository implements TypeRepository {

    @Autowired
    private TipoCRUDRepository tipoCRUDRepository;

    @Autowired
    private TypeMapper typeMapper;


    @Override
    public List<Type> getAllType() {
        List<Tipo> tipos = (List<Tipo>) tipoCRUDRepository.findAll();
        return typeMapper.toListTypes(tipos);
    }

    @Override
    public Optional<Type> getType(int id) {
        return tipoCRUDRepository.findById(id).map(Type -> typeMapper.toType(Type));
    }

    @Override
    public Type saveType(Type type) {
        Tipo tipo = typeMapper.toTipo(type);
        return typeMapper.toType(tipoCRUDRepository.save(tipo));
    }

    @Override
    public void deleteType(int typeId) {
        tipoCRUDRepository.deleteById(typeId);
    }
}
