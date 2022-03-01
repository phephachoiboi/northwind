package fi.vamk.e2000593.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.Privileges;
import fi.vamk.e2000593.northwind.service.PrivilegeService;

public class PrivilegeController {
    @Autowired
    public PrivilegeService privilegeService;

    @GetMapping("")
    public ResponseEntity<List<Privileges>> getAllPrivileges(){
        return privilegeService.getAllPrivileges();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Privileges> getPrivilegeById(@PathVariable(value = "id") Integer id){
        return privilegeService.getPrivilegesById(id);
    }

    @PutMapping("")
    public ResponseEntity<Privileges> updatePrivilege(@RequestBody Privileges privilege){
        return privilegeService.updatePrivileges(privilege);
    }

    @PostMapping("")
    public ResponseEntity<Privileges> createPrivilege(@RequestBody Privileges privilege){
        return privilegeService.updatePrivileges(privilege);
    }
}
