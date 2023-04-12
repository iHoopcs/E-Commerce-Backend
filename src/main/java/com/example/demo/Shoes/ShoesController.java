package com.example.demo.Shoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
public class ShoesController {
    @Autowired
    ShoesRepository shoesRepository;

    @RequestMapping(path = "/shoes", method = RequestMethod.GET)
    public Iterable<Shoes> fetchShoes(){
        return shoesRepository.findAll();
    }
}
