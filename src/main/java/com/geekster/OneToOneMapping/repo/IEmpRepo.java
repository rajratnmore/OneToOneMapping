package com.geekster.OneToOneMapping.repo;

import com.geekster.OneToOneMapping.model.Address;
import com.geekster.OneToOneMapping.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmpRepo extends JpaRepository<Emp, Long> {
//    public List<Emp> findByAddress(Address address);
}
