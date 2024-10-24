package com.petShop.domain.repository;

import com.petShop.domain.dto.AppointmentDTO;

import java.util.List;
import java.util.Optional;

public interface AppointmentDomainRepository {
    List<AppointmentDTO> getAll();
    Optional<AppointmentDTO> getAppointmentById(int id);
    AppointmentDTO save(AppointmentDTO appointmentDTO);
    void delete(int id);
    boolean existsAppointment(int id);
    long countAll();

    List<AppointmentDTO> findByNameOrderByIdAsc(String name);
}
