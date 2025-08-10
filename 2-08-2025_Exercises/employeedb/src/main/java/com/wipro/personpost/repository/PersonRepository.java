package com.wipro.personpost.repository;
import com.wipro.personpost.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
