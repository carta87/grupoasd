package com.asd.back.Domain.Repository;

import com.asd.back.Domain.Dto.City;
import java.util.List;
import java.util.Optional;

public interface CityRepository {
    List<City> getAllCity();
    Optional<City> getCity(int id);
    City saveCity(City city);
    void deleteCity(int cityId);
}
