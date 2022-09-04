package com.asd.back.Domain.Repository;

import com.asd.back.Domain.Dto.Active;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ActiveRepository {

    List<Active> getAllActive();
    Optional<Active> getActive(int id);
    Active saveActive(Active active);
    void deleteActive(int activeId);
    Optional<List<Active>> getActiveByType(String type);
    Optional<List<Active>> getActiveBySerial(String serial);
    Optional<List<Active>> getActiveByDate(Date date);
}
