package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.InventoryTransactionTypes;
import fi.vamk.e2000593.northwind.service.InventoryTransactionTypeService;

public class InventoryTransactionTypeController {
    @Autowired
    public InventoryTransactionTypeService inventoryTransactionTypeService;

    @GetMapping("")
    public ResponseEntity<List<InventoryTransactionTypes>> getAllInventoryTransactionType(){
        return inventoryTransactionTypeService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InventoryTransactionTypes> getInventoryTransactionTypeById(@PathVariable(value = "id") Integer id){
        return inventoryTransactionTypeService.getById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InventoryTransactionTypes> updateInventoryTransactionTypeById(@PathVariable(value = "id") Integer id, @RequestBody InventoryTransactionTypes inventoryTransactionType){
        return inventoryTransactionTypeService.updateById(id,inventoryTransactionType);
    }

    @PostMapping("")
    public ResponseEntity<InventoryTransactionTypes> createInventoryTransactionType(@RequestBody InventoryTransactionTypes inventoryTransactionType){
        return inventoryTransactionTypeService.create(inventoryTransactionType);
    }

}
