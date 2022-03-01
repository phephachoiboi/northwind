package fi.vamk.e2000593.northwind.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import fi.vamk.e2000593.northwind.entity.Customers;
import fi.vamk.e2000593.northwind.repository.CustomerRepository;

public class CustomerController {
    @Autowired
    private CustomerRepository repository;

    @GetMapping("/customer/{id}")
    public java.util.Optional<CustomerRepository> getCustomer(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/customers")
    public List<CustomerRepository> getCustomers(){
        return repository.findAll();
    }
    
    @PostMapping("/customer")
    public Customers save(@RequestBody Customers customer){
        return repository.save(customer);
    }

    @PutMapping("/customer")
    public Customers update(@RequestBody Customers customer){
        return repository.save(customer);
    }

    @DeleteMapping("/customer")
    public void delete(@RequestBody Customers customer){
        repository.delete(customer);
    }
}
