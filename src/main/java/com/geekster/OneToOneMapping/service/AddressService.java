package com.geekster.OneToOneMapping.service;

import com.geekster.OneToOneMapping.model.Address;
import com.geekster.OneToOneMapping.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "new Address added";
    }

    public List<Address> getAddresses() {
        return addressRepo.findAll();
    }
}
