package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.OrderDetailsStatus;
import fi.vamk.e2000593.northwind.service.OrderDetailsStatusService;

public class OrderDetailsStatusController {
    @Autowired
    public OrderDetailsStatusService orderDetailsStatusService;

    @GetMapping("")
    public ResponseEntity<List<OrderDetailsStatus>> getAllOrderDetailsStatus(){
        return orderDetailsStatusService.getAllOrderDetailsStatus();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDetailsStatus> getOrderDetailsStatusById(@PathVariable(value = "id") Integer id){
        return orderDetailsStatusService.getOrderDetailsStatusById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderDetailsStatus> updateOrderDetailsStatusById(@PathVariable(value = "id") Integer id, @RequestBody OrderDetailsStatus orderDetailsStatus){
        return orderDetailsStatusService.updateOrderDetailsStatusById(id,orderDetailsStatus);
    }

    @PostMapping(" ")
    public ResponseEntity<OrderDetailsStatus> createOrderDetailsStatus(@RequestBody OrderDetailsStatus orderDetailsStatus){
        return orderDetailsStatusService.createOrderDetailsStatus(orderDetailsStatus);
    }
}
