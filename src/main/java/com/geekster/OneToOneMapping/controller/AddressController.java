package com.geekster.OneToOneMapping.controller;

import com.geekster.OneToOneMapping.model.Address;
import com.geekster.OneToOneMapping.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress){
        return addressService.addAddress(newAddress);
    }

    @GetMapping("addresses")
    public List<Address> getAddresses(){
        return addressService.getAddresses();
    }


}
