package com.example.springthymeleafupload;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;

@Controller
public class FirmController {

    @GetMapping(value = "/add_firm")
    public String addFirm(Model model){
        model.addAttribute("firm", new Firm());
        return "add_firm";
    }

    @PostMapping(value = "/save_firm")
    public String saveFirm(Firm firm, Model model){
        System.out.println(firm);
        model.addAttribute("firm", new Firm());
        return "redirect:/add_firm";
    }
}
