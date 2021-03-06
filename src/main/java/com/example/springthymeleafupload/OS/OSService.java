package com.example.springthymeleafupload.OS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OSService {

    @Autowired
    private OSRepository firmRepository;

    public List<OS> findAll(){
        return firmRepository.findAll();
    }

    public void save(OS os){
         firmRepository.save(os);
    }

    public void deleteById(long id){
        firmRepository.deleteById(id);
    }
}
