package com.example.springthymeleafupload.Firms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FirmController {
    @Autowired
    private FirmService firmService;

    @GetMapping(value = "/add_firm")
    public String addFirm(Model model){
        model.addAttribute("firm", new Firm());
        return "add_firm";
    }

    @PostMapping(value = "/save_firm")
    public String saveFirm(Firm firm, Model model){
        System.out.println(firm);
        firmService.save(firm);
        model.addAttribute("firms", firmService.findAll());
        return "list_firm";
    }

    @RequestMapping(value = "/delete_firm", method = RequestMethod.GET)
    public String deleteFirm(@RequestParam(name="id") Long id){
        firmService.deleteById(id);
        return "redirect:/list_firm";
    }

    @GetMapping(value = "/list_firm")
    public String listFirm(Model model){
        model.addAttribute("firms", firmService.findAll());
        return "list_firm";
    }
}
