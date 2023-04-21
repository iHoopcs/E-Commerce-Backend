package com.example.demo.Accessories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
public class AccessoriesController {

    @Autowired
    AccessoriesRepository accessoriesRepository;

    @RequestMapping(path = "/accessories", method = RequestMethod.GET)
    public Iterable<Accessories> fetchAccessories(){
        return accessoriesRepository.findAll();
    }
}
