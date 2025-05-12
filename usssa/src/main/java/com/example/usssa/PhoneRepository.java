package com.example.usssa;

import com.example.usssa.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
    //List<Phone> findByPersonId(Long personId);
}
