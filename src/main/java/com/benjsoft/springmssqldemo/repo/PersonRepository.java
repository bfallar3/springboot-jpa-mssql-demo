package com.benjsoft.springmssqldemo.repo;

import com.benjsoft.springmssqldemo.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
