package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.Shippers;
import fi.vamk.e2000593.northwind.service.ShipperService;

public class ShipperController {
    @Autowired
    public ShipperService shipperService;

    @GetMapping("")
    public ResponseEntity<List<Shippers>> getAllShippers(){
        return shipperService.getAllShippers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Shippers> getShipperById(@PathVariable(value = "id") Integer id){
        return shipperService.getShipperById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Shippers> updateShipperById(@PathVariable(value = "id") Integer id, @RequestBody Shippers shipper){
        return shipperService.updateShipperById(id,shipper);
    }

    @PostMapping("")
    public ResponseEntity<Shippers> createShipper(@RequestBody Shippers shipper){
        return shipperService.createShipper(shipper);
    }
}
