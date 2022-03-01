package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.Orders;
import fi.vamk.e2000593.northwind.service.OrderService;

public class OrderController {
    @Autowired
    public OrderService orderService;

    @GetMapping("")
    public ResponseEntity<List<Orders>> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orders> getOrderById(@PathVariable(value = "id") Integer id){
        return orderService.getOrderById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Orders> updateOrderById(@PathVariable(value = "id") Integer id, @RequestBody Orders order){
        return orderService.updateOrderById(id, order);
    }

    @PostMapping("/customer-id/{customerId}/status-id/{statusId}/employee-id/{employeeId}/tax-status-id/{taxStatusId}/shipper-id/{shipperId}")
    public ResponseEntity<Orders> createOrder(@RequestBody Orders order, @PathVariable(value = "customerId") Integer customerId, @PathVariable(value = "statusId") Integer statusId){
        return orderService.createNewOrder(order,customerId,statusId);
    }
}
