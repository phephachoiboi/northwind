package fi.vamk.e2000593.northwind.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import fi.vamk.e2000593.northwind.entity.Employees;
import fi.vamk.e2000593.northwind.service.EmployeeService;

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("")
    public ResponseEntity<List<Employees>> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employees> getCustomerById(@PathVariable(value = "id") Integer id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employees> updateEmployeeById(@PathVariable(value = "id") Integer id, @RequestBody Employees employee){
        return employeeService.updateEmployeeById(id,employee);
    }

    @PostMapping("")
    public ResponseEntity<Employees> createEmployee(@RequestBody Employees employee){
        return employeeService.createEmployee(employee);
    }
}
