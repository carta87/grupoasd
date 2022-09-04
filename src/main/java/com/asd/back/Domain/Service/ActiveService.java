package com.asd.back.Domain.Service;

import com.asd.back.Domain.Dto.Active;
import com.asd.back.Domain.Repository.ActiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ActiveService{

    @Autowired
    private ActiveRepository activeRepository;

    public List<Active> getAllActive() {
        return activeRepository.getAllActive();
    }

    public Optional<Active> getActive(int id) {
        return activeRepository.getActive(id);}

    public Active saveActive(Active active) {
        return activeRepository.saveActive(active);
    }

    public boolean deleteActive(int activeId) {
        return getActive(activeId).map(active -> {
            activeRepository.deleteActive(activeId);
            return true;
        }).orElse(false);
    }

    public Optional<List<Active>> getActiveByType(String type){
        return activeRepository.getActiveByType(type);
    }
    
    public  Optional<List<Active>> getActiveBySerial(String serial){
        return  activeRepository.getActiveBySerial(serial);
    }
    
    public Optional<List<Active>> getActiveByDate(Date date){
        return  activeRepository.getActiveByDate(date);
    }


}
