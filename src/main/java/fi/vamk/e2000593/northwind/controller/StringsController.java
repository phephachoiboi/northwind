package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.Strings;
import fi.vamk.e2000593.northwind.service.StringsService;

public class StringsController {
    @Autowired
    public StringsService stringsService;

    @GetMapping("")
    public ResponseEntity<List<Strings>> getAllStrings(){
        return stringsService.getAllStrings();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Strings> getStringsById(@PathVariable(value = "id") Integer id){
        return stringsService.getStringsById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Strings> updateStringsById(@PathVariable(value = "id") Integer id, @RequestBody Strings strings){
        return stringsService.updateStringsById(id,strings);
    }

    @PostMapping("")
    public ResponseEntity<Strings> createStrings(@RequestBody Strings strings){
        return stringsService.createStrings(strings);
    }
}
