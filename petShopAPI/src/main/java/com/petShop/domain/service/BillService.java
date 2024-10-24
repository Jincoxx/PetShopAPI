package com.petShop.domain.service;

import com.petShop.domain.dto.BillDTO;
import com.petShop.domain.repository.BillDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillService {

    @Autowired
    private BillDomainRepository billDomainRepository;

    public List<BillDTO> getAll() {
        return billDomainRepository.getAll();
    }

    public Optional<BillDTO> getBilltById(int id) {
        return billDomainRepository.getBillById(id);
    }

    public BillDTO save(BillDTO billDTO){
        return billDomainRepository.save(billDTO);
    }

    public boolean delete(int id) {
        return getBilltById(id).map(bill -> {
            billDomainRepository.delete(id);
            return true;
        }).orElse(false);
    }

    public boolean existsBill(int id) {
        return billDomainRepository.existsBill(id);
    }

    public long countAll() {
        return billDomainRepository.countAll();
    }
}

