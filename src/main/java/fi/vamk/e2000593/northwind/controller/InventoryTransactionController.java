package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.InventoryTransactions;
import fi.vamk.e2000593.northwind.service.InventoryTransactionService;

public class InventoryTransactionController {
    @Autowired
    public InventoryTransactionService inventoryTransactionService;

    @GetMapping("")
    public ResponseEntity<List<InventoryTransactions>> getAllInventoryTransaction(){
        return inventoryTransactionService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InventoryTransactions> getInventoryTransactionById(@PathVariable(value = "id") Integer id){
        return inventoryTransactionService.getById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InventoryTransactions> updateInventoryTransactionById(@PathVariable(value = "id") Integer id, @RequestBody InventoryTransactions inventoryTransaction){
        return inventoryTransactionService.updateById(id,inventoryTransaction);
    }

    @PostMapping("")
    public ResponseEntity<InventoryTransactions> createInventoryTransaction(@RequestBody InventoryTransactions inventoryTransaction){
        return inventoryTransactionService.create(inventoryTransaction);
    }
}
