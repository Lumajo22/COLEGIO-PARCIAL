package com.institution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.institution.service.ClaseService;

@Controller
@RequestMapping("/clases")
public class ClaseController {

    @Autowired
    private ClaseService claseService;

    @GetMapping("/new")
    public String showFormByUsername(String username) {
        
        return "form"; 
    }

	public ClaseService getClaseService() {
		return claseService;
	}

	public void setClaseService(ClaseService claseService) {
		this.claseService = claseService;
	}
}
