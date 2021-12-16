package com.example.apartmentservice;

import com.example.apartmentservice.entity.Apartment;
import com.example.apartmentservice.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApartmentService {

    @Autowired
    private ApartmentRepository apartmentRepository;

    public Apartment saveAepartment(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    public Apartment findAeparmentById(Long apartmentId) {
        return apartmentRepository.findById(apartmentId).get();
    }

    public Apartment updateApartment(Apartment apartment){
       return   apartmentRepository.save(apartment);
    }

    public void delete(Long apartmentID) {
        apartmentRepository.deleteById(apartmentID);
    }
}
