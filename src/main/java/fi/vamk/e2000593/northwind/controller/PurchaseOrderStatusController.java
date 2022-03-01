package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.PurchaseOrderStatus;
import fi.vamk.e2000593.northwind.service.PurchaseOrderStatusService;

public class PurchaseOrderStatusController {
    @Autowired
    public PurchaseOrderStatusService purchaseOrderStatusService;

    @GetMapping("")
    public ResponseEntity<List<PurchaseOrderStatus>> getAllStrings(){
        return purchaseOrderStatusService.getAllPurchaseOrderStatus();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PurchaseOrderStatus> getStringsById(@PathVariable(value = "id") Integer id){
        return purchaseOrderStatusService.getPurchaseOrderStatusById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PurchaseOrderStatus> updateStringsById(@PathVariable(value = "id") Integer id, @RequestBody PurchaseOrderStatus purchaseOrderStatus){
        return purchaseOrderStatusService.updatePurchaseOrderStatusById(id,purchaseOrderStatus);
    }

    @PostMapping("")
    public ResponseEntity<PurchaseOrderStatus> createStrings(@RequestBody PurchaseOrderStatus purchaseOrderStatus){
        return purchaseOrderStatusService.createPurchaseOrderStatus(purchaseOrderStatus);
    }
}
