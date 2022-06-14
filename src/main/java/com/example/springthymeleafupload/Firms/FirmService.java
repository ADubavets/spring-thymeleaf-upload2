package com.example.springthymeleafupload.Firms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirmService {
    @Autowired
    private FirmRepository firmRepository;

    public List<Firm> findAll(){
        return firmRepository.findAll();
    }

    public void save(Firm firm){
         firmRepository.save(firm);
    }

    public void deleteById(long id){
        firmRepository.deleteById(id);
    }
}
