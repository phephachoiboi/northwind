package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.OrdersTaxStatus;
import fi.vamk.e2000593.northwind.service.OrdersTaxStatusService;

public class OrdersTaxStatusController {
    @Autowired
    public OrdersTaxStatusService ordersTaxStatusService;

    @GetMapping("")
    public ResponseEntity<List<OrdersTaxStatus>> getAllOrdersTaxStatus(){
        return ordersTaxStatusService.getAllOrdersTaxStatus();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrdersTaxStatus> getOrdersTaxStatusById(@PathVariable(value = "id") Integer id){
        return ordersTaxStatusService.getOrdersTaxStatusById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrdersTaxStatus> updateOrdersTaxStatusById(@PathVariable(value = "id") Integer id, @RequestBody OrdersTaxStatus ordersTaxStatus){
        return ordersTaxStatusService.updateOrdersTaxStatusById(id,ordersTaxStatus);
    }

    @PostMapping("")
    public ResponseEntity<OrdersTaxStatus> createOrdersTaxStatus(@RequestBody OrdersTaxStatus ordersTaxStatus){
        return ordersTaxStatusService.createOrdersTaxStatus(ordersTaxStatus);
    }
}
