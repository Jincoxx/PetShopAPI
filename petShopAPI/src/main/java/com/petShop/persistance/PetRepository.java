package com.petShop.persistance;

import com.petShop.persistance.crud.PetCrudRepository;
import com.petShop.persistance.entity.Appointment;
import com.petShop.persistance.entity.Pet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class PetRepository {
    private PetCrudRepository petCrudRepository;

    public List<Pet> getAll() {

        return (List<Pet>) petCrudRepository.findAll();
    }

    public Optional<Pet> getPetById(int idPet){
        return petCrudRepository.findById(idPet);
    }

    public Pet save(Pet pet){
        return petCrudRepository.save(pet);
    }

    public void deleted(int idPet){
        petCrudRepository.deleteById(idPet);
    }

    public boolean existsPet(int idPet){
        return petCrudRepository.existsById(idPet);
    }

    public long countAll(){
        return petCrudRepository.count();
    }

}
