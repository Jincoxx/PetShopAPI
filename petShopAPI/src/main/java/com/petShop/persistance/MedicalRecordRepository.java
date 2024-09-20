package com.petShop.persistance;

import com.petShop.persistance.crud.BillCrudRepository;
import com.petShop.persistance.crud.MedialRecordCrudRepository;
import com.petShop.persistance.entity.Bill;
import com.petShop.persistance.entity.MedicalRecord;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class MedicalRecordRepository {
    private MedialRecordCrudRepository  medialRecordCrudRepository;

    public List<MedicalRecord> getAllMedicalRecords() {
        return (List<MedicalRecord>) medialRecordCrudRepository.findAll();
    }

    public Optional<MedicalRecord> getMedicalRecordById(int idMedicalRecord){
        return medialRecordCrudRepository.findById(idMedicalRecord);
    }

    public MedicalRecord save(MedicalRecord medicalRecord){
        return medialRecordCrudRepository.save(medicalRecord);
    }

    public void deleted(int idMedicalRecord){
        medialRecordCrudRepository.deleteById(idMedicalRecord);
    }

    public boolean existsBill(int idMedicalRecord){
        return medialRecordCrudRepository.existsById(idMedicalRecord);
    }

    public long countAll(){
        return medialRecordCrudRepository.count();
    }
}
