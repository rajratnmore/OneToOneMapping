package com.geekster.OneToOneMapping.controller;

import com.geekster.OneToOneMapping.model.Address;
import com.geekster.OneToOneMapping.model.Emp;
import com.geekster.OneToOneMapping.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("emps")
    public List<Emp> getEmployees(){
        return empService.getEmployees();
    }

    @PostMapping("emp")
    public String addEmp(@RequestBody Emp newEmp){
        return empService.addEmp(newEmp);
    }

//    @GetMapping("emps/{empId}/address")
//    public Address getAddressOfEmployee(@PathVariable Long empId){
//        return empService.getAddressOfEmployee(empId);
//    }

//    @GetMapping("employee/address/{addressId}")
//    public List<Emp> getEmployeeByAddressId(@PathVariable Integer addressId){
//        return empService.getEmployeeByAddressId(addressId);
//    }

}
