package com.example.springthymeleafupload.Smart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartService {
    private final SmartRepository smartRepository;

    public SmartService(SmartRepository smartRepository) {
        this.smartRepository = smartRepository;
    }

    public List<Smart> findAll(){
        return smartRepository.findAll();
    }

    public void save(Smart firm){
        smartRepository.save(firm);
    }

    public void deleteById(long id){
        smartRepository.deleteById(id);
    }
}
