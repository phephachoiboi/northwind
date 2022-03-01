package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.SalesReports;
import fi.vamk.e2000593.northwind.service.SalesReportService;

public class SalesReportController {
    
    @Autowired
    public SalesReportService salesReportService;

    @GetMapping("")
    public ResponseEntity<List<SalesReports>> getAllStrings(){
        return salesReportService.getAllSalesReports();
    }

    @GetMapping("/\"{id}\"")
    public ResponseEntity<SalesReports> getStringsById(@PathVariable(value = "id") String id){
        return salesReportService.getSalesReportById(id);
    }

    @PutMapping("/\"{id}\"")
    public ResponseEntity<SalesReports> updateStringsById(@PathVariable(value = "id") String id, @RequestBody SalesReports salesReport){
        return salesReportService.updateSalesReportById(id,salesReport);
    }

    @PostMapping("")
    public ResponseEntity<SalesReports> createStrings(@RequestBody SalesReports salesReport){
        return salesReportService.createSalesReport(salesReport);
    }
}
