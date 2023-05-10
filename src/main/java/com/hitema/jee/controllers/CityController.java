package com.hitema.jee.controllers;

import com.hitema.jee.entities.City;
import com.hitema.jee.services.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CityController {

    private static final Logger log = LoggerFactory.getLogger(CityController.class);
    private CityService service;

    public CityController(CityService service) {
        this.service = service;
    }

    private void check() {
        log.info("Check postconstruct called service Up : " + (service != null ? "Yes" : "No"));
    }

    @GetMapping("/cities")
    public ModelAndView getCities() {
        List<City> cities = service.readAll();
        return new ModelAndView("cities", "cities", cities);
    }

    @GetMapping("/searchCities")
    public ModelAndView searchCities(@RequestParam("search") String searchString) {
        List<City> cities = service.findByName(searchString);
        return new ModelAndView("searchResults", "cities", cities);
    }
}






