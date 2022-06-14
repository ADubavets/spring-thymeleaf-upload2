package com.example.springthymeleafupload.Smart;

import com.example.springthymeleafupload.Firms.Firm;
import com.example.springthymeleafupload.OS.OS;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Smart {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "firm_id", referencedColumnName = "id")
    private Firm firm;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "os_id", referencedColumnName = "id")
    private OS os;
    private double size;
    private String color;

}
