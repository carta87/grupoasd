package com.asd.back.Persistence;


import com.asd.back.Domain.Dto.City;
import com.asd.back.Domain.Repository.CityRepository;
import com.asd.back.Persistence.CRUD.CiudadCRUDRepository;
import com.asd.back.Persistence.Entity.Ciudad;
import com.asd.back.Persistence.Mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CiudadRepository implements CityRepository   {

    @Autowired
    private CiudadCRUDRepository ciudadCRUDRepository;

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> getAllCity() {
        List<Ciudad> ciudads = (List<Ciudad>) ciudadCRUDRepository.findAll();
        return cityMapper.toListCity(ciudads);
    }

    @Override
    public Optional<City> getCity(int id) {
        return ciudadCRUDRepository.findById(id).map(City -> cityMapper.toCity(City));
    }

    @Override
    public City saveCity(City city) {
        Ciudad ciudad = cityMapper.toCiudad(city);
        return cityMapper.toCity(ciudadCRUDRepository.save(ciudad));
    }

    @Override
    public void deleteCity(int cityId) {
        ciudadCRUDRepository.deleteById(cityId);
    }
}

