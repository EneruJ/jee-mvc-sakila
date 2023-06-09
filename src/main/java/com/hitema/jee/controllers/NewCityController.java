package com.hitema.jee.controllers;

import com.hitema.jee.entities.City;
import com.hitema.jee.services.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewCityController {

    // Logger
    private static final Logger log = LoggerFactory.getLogger(NewCityController.class);

    // Service
    private CityService service;

    // Constructor
    public NewCityController(CityService service) {
        this.service = service;
    }

    // Method
    private void check() {
        log.info("Check postconstruct called service Up : " + (service != null ? "Yes" : "No"));
    }

    @GetMapping("/new")
    public String newCity() {
        return "newcity";
    }

    @RequestMapping(value = "/new", method = org.springframework.web.bind.annotation.RequestMethod.POST)
    public String create(@Validated @ModelAttribute("newCityForm") City city, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "newcity";
        }

        service.create(city);
        return "redirect:/cities";
    }


}
