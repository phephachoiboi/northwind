package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.Suppliers;
import fi.vamk.e2000593.northwind.service.SupplierService;

public class SupplierController {
    
    @Autowired
    public SupplierService supplierService;

    @GetMapping("")
    public ResponseEntity<List<Suppliers>> getAllStrings(){
        return supplierService.getAllSupplier();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Suppliers> getStringsById(@PathVariable(value = "id") Integer id){
        return supplierService.getSupplierById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Suppliers> updateStringsById(@PathVariable(value = "id") Integer id, @RequestBody Suppliers supplier){
        return supplierService.updateSupplierById(id,supplier);
    }

    @PostMapping("")
    public ResponseEntity<Suppliers> createStrings(@RequestBody Suppliers supplier){
        return supplierService.createSupplier(supplier);
    }
}
