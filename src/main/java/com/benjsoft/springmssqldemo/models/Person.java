package com.benjsoft.springmssqldemo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "People")
@Getter
@Setter
public class Person {
   @Id
   @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
   private Long id;
   @Column(name = "FirstName")
   private String firstName;
   @Column(name = "MiddleName")
   private String middleName;
   @Column(name = "LastName")
   private String lastName;
}
