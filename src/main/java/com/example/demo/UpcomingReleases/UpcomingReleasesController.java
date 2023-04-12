package com.example.demo.UpcomingReleases;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
public class UpcomingReleasesController {
    @Autowired
    UpcomingReleasesRepository upcomingReleasesRepository;

    @RequestMapping(path = "/upcomingReleases", method = RequestMethod.GET)
    public Iterable<UpcomingReleases> fetchUpcomingReleases(){return upcomingReleasesRepository.findAll(); }
}
