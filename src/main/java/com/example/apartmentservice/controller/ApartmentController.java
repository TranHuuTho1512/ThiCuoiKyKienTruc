package com.example.apartmentservice.controller;

import com.example.apartmentservice.ApartmentService;
import com.example.apartmentservice.entity.Apartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apartment")
public class ApartmentController {

    @Autowired
    private ApartmentService apartmentService;

    @PostMapping("/")
    public Apartment saveDeparment(@RequestBody Apartment apartment){
        return apartmentService.saveAepartment(apartment);
    }
    @GetMapping("/{id}")
    public Apartment findDeparmentById(@PathVariable("id") Long ApartmentId){
        return apartmentService.findAeparmentById(ApartmentId);
    }
    @PostMapping("/update")
    public void updateApartment(@RequestBody Apartment apartment) {
        apartmentService.updateApartment(apartment);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteApartment(@PathVariable("id") Long ApartmentId) {
        apartmentService.delete(ApartmentId);
    }
}
