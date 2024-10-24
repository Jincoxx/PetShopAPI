package com.petShop.domain.repository;

import com.petShop.domain.dto.OwnerDTO;
import com.petShop.domain.dto.OwnerDTO;

import java.util.List;
import java.util.Optional;

public interface OwnerDomainRepository {
    List<OwnerDTO> getAll();
    Optional<OwnerDTO> getOwnerById(int id);
    OwnerDTO save(OwnerDTO ownerDTO);
    void delete(int id);
    boolean existsOwner(int id);
    long countAll();
}
