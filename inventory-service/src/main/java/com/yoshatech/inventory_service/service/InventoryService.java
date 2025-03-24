package com.yoshatech.inventory_service.service;

import org.springframework.stereotype.Service;

import com.yoshatech.inventory_service.repository.InventoryRepository;

import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;  

    @Transactional(readOnly = true)
    public boolean doesExist(String skuCode) {
        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }
}