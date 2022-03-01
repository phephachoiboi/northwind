package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.OrdersStatus;
import fi.vamk.e2000593.northwind.service.OrdersStatusService;

public class OrdersStatusController {
    @Autowired
    public OrdersStatusService ordersStatusService;

    @GetMapping("")
    public ResponseEntity<List<OrdersStatus>> getAllOrdersStatus(){
        return ordersStatusService.getAllOrdersStatus();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrdersStatus> getOrdersStatusById(@PathVariable(value = "id") Integer id){
        return ordersStatusService.getOrdersStatusById(id);
    }

    @PutMapping("")
    public ResponseEntity<OrdersStatus> updateOrderStatus(@RequestBody OrdersStatus ordersStatus){
        return ordersStatusService.updateOrderStatus(ordersStatus);
    }

    @PostMapping("")
    public ResponseEntity<OrdersStatus> createOrdersStatus(@RequestBody OrdersStatus ordersStatus){
        return ordersStatusService.createOrdersStatus(ordersStatus);
    }
}
