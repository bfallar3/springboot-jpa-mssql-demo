package com.benjsoft.springmssqldemo.repo;

import com.benjsoft.springmssqldemo.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
