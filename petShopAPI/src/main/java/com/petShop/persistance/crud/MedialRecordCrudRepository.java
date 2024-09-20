package com.petShop.persistance.crud;

import com.petShop.persistance.entity.MedicalRecord;
import org.springframework.data.repository.CrudRepository;

public interface MedialRecordCrudRepository extends CrudRepository<MedicalRecord,Integer> {
}
