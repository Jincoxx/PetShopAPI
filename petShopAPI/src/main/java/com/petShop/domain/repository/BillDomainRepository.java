package com.petShop.domain.repository;


import com.petShop.domain.dto.BillDTO;

import java.util.List;
import java.util.Optional;

public interface BillDomainRepository {
    List<BillDTO> getAll();
    Optional<BillDTO> getBillById(int id);
    BillDTO save(BillDTO billDTO);
    void delete(int id);
    boolean existsBill(int id);
    long countAll();
}
