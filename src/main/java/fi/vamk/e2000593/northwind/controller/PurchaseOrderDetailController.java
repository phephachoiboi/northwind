package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.PurchaseOrderDetails;
import fi.vamk.e2000593.northwind.service.PurchaseOrderDetailService;

public class PurchaseOrderDetailController {
    @Autowired
    public PurchaseOrderDetailService purchaseOrderDetailService;

    @GetMapping("")
    public ResponseEntity<List<PurchaseOrderDetails>> getAllPurchaseOrderDetail(){
        return purchaseOrderDetailService.getPurchaseOrderDetail();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PurchaseOrderDetails> getPurchaseOrderDetailById(@PathVariable(value = "id") Integer id){
        return purchaseOrderDetailService.getPurchaseOrderDetailById(id);
    }

    @PutMapping("/{purchaseOrderDetailID}/inventory-id/{inventoryID}/product-id/{productId}/purchase-order-id/{purchaseOrderId}")
    public ResponseEntity<PurchaseOrderDetails> updatePurchaseOrderDetailById(@PathVariable(value = "purchaseOrderDetailID") Integer purchaseOrderDetailID, @PathVariable(value = "inventoryID") Integer inventoryID){
        return purchaseOrderDetailService.updatePurchaseOrderDetailById(purchaseOrderDetailID, inventoryID);
    }

    @PostMapping("")
    public ResponseEntity<PurchaseOrderDetails> createPurchaseOrderDetail(@RequestBody PurchaseOrderDetails purchaseOrderDetail){
        return purchaseOrderDetailService.createPurchaseOrderDetail(purchaseOrderDetail);
    }
}
