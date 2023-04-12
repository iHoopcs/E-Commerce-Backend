package com.example.demo.Clothing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
public class ClothingController {
    @Autowired
    ClothingRepository clothingRepository;

    @RequestMapping(path = "/clothing", method = RequestMethod.GET)
    public Iterable<Clothing> fetchClothing(){
        return clothingRepository.findAll();
    }
}
