package com.benjsoft.springmssqldemo.models;

import javax.persistence.Column;

public class MdrResult {
   @Column(name = "BusinessProfileId")
   private Long businessProfileId;
   @Column(name = "YearSubmitted")
   private int yearSubmitted;
   @Column(name = "MonthSubmitted")
   private int monthSubmitted;
   @Column(name = "DaySubmitted")
   private int daySubmitted;
}
