package fi.vamk.e2000593.northwind.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import fi.vamk.e2000593.northwind.entity.OrderDetails;
import fi.vamk.e2000593.northwind.entity.Orders;

public class OrderService {

    public ResponseEntity<List<Orders>> getAllOrders() {
        return null;
    }

    public ResponseEntity<Orders> getOrderById(Integer id) {
        return null;
    }

    public ResponseEntity<Orders> updateOrderById(Integer id, Orders order) {
        return null;
    }

    public ResponseEntity<Orders> createNewOrder(Orders order, Integer customerId, Integer statusId) {
        return null;
    }

    public ResponseEntity<List<OrderDetails>> getAllOrderDetails() {
        return null;
    }

    public ResponseEntity<OrderDetails> getOrderDetailById(Integer id) {
        return null;
    }

    public ResponseEntity<OrderDetails> updateOrderDetailById(Integer id, OrderDetails orderDetail) {
        return null;
    }

    public ResponseEntity<OrderDetails> createOrderDetail(OrderDetails orderDetail) {
        return null;
    }
    
}
