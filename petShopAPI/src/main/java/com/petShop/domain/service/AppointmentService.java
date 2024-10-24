package com.petShop.domain.service;


import com.petShop.domain.dto.AppointmentDTO;
import com.petShop.domain.repository.AppointmentDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentDomainRepository appointmentDomainRepository;

    public List<AppointmentDTO> getAll() {
        return appointmentDomainRepository.getAll();
    }

    public Optional<AppointmentDTO> getAppointmentById(int id) {
        return appointmentDomainRepository.getAppointmentById(id);
    }

    public AppointmentDTO save(AppointmentDTO appointmentDTO){
        return appointmentDomainRepository.save(appointmentDTO);
    }

    public boolean delete(int id) {
        return getAppointmentById(id).map(appointmentDTO -> {
            appointmentDomainRepository.delete(id);
            return true;
        }).orElse(false);
    }

    public boolean existsAppointment(int id) {
        return appointmentDomainRepository.existsAppointment(id);
    }

    public long countAll() {
        return appointmentDomainRepository.countAll();
    }

    //public List<AppointmentDTO> getByName(String name) {
      //  return AppointmentDomainRepository.findByNameOrderByIdAsc(String name);
    //}

}
