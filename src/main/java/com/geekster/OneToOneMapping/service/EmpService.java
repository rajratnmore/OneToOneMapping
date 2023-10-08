package com.geekster.OneToOneMapping.service;

import com.geekster.OneToOneMapping.model.Address;
import com.geekster.OneToOneMapping.model.Emp;
import com.geekster.OneToOneMapping.repo.IAddressRepo;
import com.geekster.OneToOneMapping.repo.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    IEmpRepo empRepo;

    @Autowired
    IAddressRepo addressRepo;

    public List<Emp> getEmployees() {
        return empRepo.findAll();
    }

    public String addEmp(Emp newEmp) {
        empRepo.save(newEmp);
        return "new Employee added";
    }

//    public Address getAddressOfEmployee(Long empId) {
//        Emp employee = empRepo.findById(empId).orElseThrow();
//        return employee.getAddress();
//    }

//    public List<Emp> getEmployeeByAddressId(Integer addressId) {
//        Address address = addressRepo.findById(addressId).orElseThrow();
//        return empRepo.findByAddress(address);
//    }
}

