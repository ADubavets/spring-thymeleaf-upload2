package com.example.springthymeleafupload.OS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class OSController {

    @Autowired
    private OSService osService;

    @GetMapping(value = "/add_os")
    public String addOS(Model model){
        model.addAttribute("os", new OS());
        return "add_os";
    }

    @PostMapping(value = "/save_os")
    public String saveOS(OS os, Model model){
        System.out.println(os);
        osService.save(os);
        model.addAttribute("os", osService.findAll());
        return "list_os";
    }

    @RequestMapping(value = "/delete_os", method = RequestMethod.GET)
    public String deleteOS(@RequestParam(name="id") Long id){
        osService.deleteById(id);
        return "redirect:/list_os";
    }

    @GetMapping(value = "/list_os")
    public String listFirm(Model model){
        model.addAttribute("os", osService.findAll());
        return "list_os";
    }
}
