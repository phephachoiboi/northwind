package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.PurchaseOrders;
import fi.vamk.e2000593.northwind.service.PurchaseOrderService;

public class PurchaseOrderController {
    @Autowired
    public PurchaseOrderService purchaseOrderService;

    @GetMapping("")
    public ResponseEntity<List<PurchaseOrders>> getAllPurchaseOrders(){
        return purchaseOrderService.getAllPurchaseOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PurchaseOrders> getPurchaseOrderById(@PathVariable(value = "id") Integer id){
        return purchaseOrderService.getPurchaseOrderById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PurchaseOrders> updatePurchaseOrderById(@PathVariable(value = "id") Integer id, @RequestBody PurchaseOrders purchaseOrder){
        return purchaseOrderService.updatePurchaseOrderById(id,purchaseOrder);
    }

    @PostMapping("")
    public ResponseEntity<PurchaseOrders> createPurchaseOrder(@RequestBody PurchaseOrders purchaseOrder){
        return purchaseOrderService.createPurchaseOrder(purchaseOrder);
    }
}
