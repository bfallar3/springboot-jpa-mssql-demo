package com.benjsoft.springmssqldemo.controllers;

import com.benjsoft.springmssqldemo.models.MdrReportResponse;
import com.benjsoft.springmssqldemo.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.benjsoft.springmssqldemo.repo.PersonRepository;

import javax.persistence.*;
import java.util.List;

@RestController
public class PersonController {

   @Autowired
   private PersonRepository personRepository;

   @PersistenceContext
   private EntityManager entityManager;

   @GetMapping("/persons")
   public List<Person> getAllPersons() {
      return personRepository.findAll();
   }

   @GetMapping(value = "/mdr/{agencyId}", produces = "application/json")
   public List<MdrReportResponse> generateMdr(@PathVariable("agencyId") Long agencyId) {
      StoredProcedureQuery sp_generate_mdr_submissions_per_agency = entityManager.createStoredProcedureQuery("sp_generate_mdr_submissions_per_agency", MdrReportResponse.class);
      sp_generate_mdr_submissions_per_agency.registerStoredProcedureParameter("AgencyId", Long.class, ParameterMode.IN);
      sp_generate_mdr_submissions_per_agency.setParameter("AgencyId", agencyId);
      sp_generate_mdr_submissions_per_agency.execute();

      List<MdrReportResponse> resultList = (List<MdrReportResponse>)sp_generate_mdr_submissions_per_agency.getResultList();
      return resultList;
   }
}
