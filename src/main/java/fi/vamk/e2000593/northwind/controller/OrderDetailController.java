package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.OrderDetails;
import fi.vamk.e2000593.northwind.service.OrderService;

public class OrderDetailController {
    @Autowired
    public OrderService orderDetailService;

    @GetMapping("")
    public ResponseEntity<List<OrderDetails>> getAllOrderDetails(){
        return orderDetailService.getAllOrderDetails();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDetails> getOrderDetailById(@PathVariable(value = "id") Integer id){
        return orderDetailService.getOrderDetailById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderDetails> updateOrderDetailById(@PathVariable(value = "id") Integer id, @RequestBody OrderDetails orderDetail){
        return orderDetailService.updateOrderDetailById(id,orderDetail);
    }

    @PostMapping("")
    public ResponseEntity<OrderDetails> createOrderDetail(@RequestBody OrderDetails orderDetail){
        return orderDetailService.createOrderDetail(orderDetail);
    }
}
