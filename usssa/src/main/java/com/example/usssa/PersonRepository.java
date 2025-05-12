package com.example.usssa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByName(String name);

    List<Person> findByAge(int age);

    List<Person> findByNameAndAge(String name, int age);
}
