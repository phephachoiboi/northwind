package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.Invoices;
import fi.vamk.e2000593.northwind.service.InvoiceService;

public class InvoiceController {
    @Autowired
    public InvoiceService invoiceService;

    @GetMapping("")
    public ResponseEntity<List<Invoices>> getAllInvoice(){
        return invoiceService.getAllInvoice();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Invoices> getInvoiceById(@PathVariable(value = "id") Integer id){
        return invoiceService.getInvoiceById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Invoices> updateInvoiceById(@PathVariable(value = "id") Integer id, @RequestBody Invoices invoice){
        return invoiceService.updateInvoiceById(id,invoice);
    }

    @PostMapping("")
    public ResponseEntity<Invoices> createInvoice(@RequestBody Invoices invoice){
        return invoiceService.createInvoice(invoice);
    }
}
