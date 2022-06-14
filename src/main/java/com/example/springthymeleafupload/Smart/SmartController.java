package com.example.springthymeleafupload.Smart;

import com.example.springthymeleafupload.Firms.FirmService;
import com.example.springthymeleafupload.OS.OSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SmartController {
    private final SmartService smartService;

    public SmartController(SmartService smartRepository) {
        this.smartService = smartRepository;
    }
    @Autowired
    private FirmService firmService;

    @Autowired
    private OSService osService;

    @GetMapping(value = "/add_smart")
    public String addSmart(Model model){
        model.addAttribute("smart", new Smart());
        model.addAttribute("firms", firmService.findAll());
        model.addAttribute("os", osService.findAll());
        return "add_smart";
    }

    @PostMapping(value = "/save_smart")
    public String saveSmart(Smart smart, Model model){
        System.out.println(smart);
        smartService.save(smart);
        model.addAttribute("smarts", smartService.findAll());
        return "list_smart";
    }

    @RequestMapping(value = "/delete_smart", method = RequestMethod.GET)
    public String deleteSmart(@RequestParam(name="id") Long id){
        smartService.deleteById(id);
        return "redirect:/list_smart";
    }

    @GetMapping(value = "/list_smart")
    public String listFirm(Model model){
        model.addAttribute("smarts", smartService.findAll());
        return "list_smart";
    }
}
