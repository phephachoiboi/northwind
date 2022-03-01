package fi.vamk.e2000593.northwind.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import fi.vamk.e2000593.northwind.entity.PurchaseOrderDetails;

public class PurchaseOrderDetailService {

    public ResponseEntity<List<PurchaseOrderDetails>> getPurchaseOrderDetail() {
        return null;
    }

    public ResponseEntity<PurchaseOrderDetails> getPurchaseOrderDetailById(Integer id) {
        return null;
    }

    public ResponseEntity<PurchaseOrderDetails> createPurchaseOrderDetail(PurchaseOrderDetails purchaseOrderDetail) {
        return null;
    }

    public ResponseEntity<PurchaseOrderDetails> updatePurchaseOrderDetailById(Integer purchaseOrderDetailID,
            Integer inventoryID, Integer productId, Integer invepurchaseOrderIdntoryID,
            PurchaseOrderDetails purchaseOrderDetail) {
        return null;
    }

    public ResponseEntity<PurchaseOrderDetails> updatePurchaseOrderDetailById(Integer purchaseOrderDetailID,
            Integer inventoryID) {
        return null;
    }
    
}
