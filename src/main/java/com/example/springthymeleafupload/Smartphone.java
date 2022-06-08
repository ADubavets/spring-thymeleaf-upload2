package com.example.springthymeleafupload;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Smartphone {


    private Long id;
    private String name;
    private double size;
    private String color;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
