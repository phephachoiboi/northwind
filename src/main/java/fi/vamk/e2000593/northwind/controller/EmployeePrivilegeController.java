package fi.vamk.e2000593.northwind.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import fi.vamk.e2000593.northwind.entity.EmployeePrivilegeId;
import fi.vamk.e2000593.northwind.entity.EmployeePrivileges;
import fi.vamk.e2000593.northwind.service.EmployeePrivilegeService;
import io.swagger.annotations.ApiOperation;

public class EmployeePrivilegeController {
    @Autowired
    public EmployeePrivilegeService employeePrivilegeService;

    @GetMapping("")
    public ResponseEntity<List<EmployeePrivileges>> getAllEmployeePrivilege(){
        return employeePrivilegeService.getAllEmployeePrivilege();
    }

    @ApiOperation(value = "Gets an entry from employee_privilege table by given id",notes = "id - is an object: {employeeId: value, privilegeId: value}")
    @GetMapping("/id")
    public ResponseEntity<EmployeePrivileges> getEmployeePrivilegeById(@RequestBody EmployeePrivilegeId id){
        return employeePrivilegeService.getEmployeePrivilegeById(id);
    }
}
