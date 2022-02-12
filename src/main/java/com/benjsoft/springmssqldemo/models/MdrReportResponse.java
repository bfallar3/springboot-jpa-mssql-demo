package com.benjsoft.springmssqldemo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MdrReportResponse {
   @Id
   @Column(name = "BusinessProfileId")
   private Long businessProfileId;
   @Column(name = "YearSubmitted")
   private int yearSubmitted;
   @Column(name = "MonthSubmitted")
   private int monthSubmitted;
   @Column(name = "DaySubmitted")
   private int daySubmitted;

   public Long getBusinessProfileId() {
      return businessProfileId;
   }

   public void setBusinessProfileId(Long businessProfileId) {
      this.businessProfileId = businessProfileId;
   }

   public int getYearSubmitted() {
      return yearSubmitted;
   }

   public void setYearSubmitted(int yearSubmitted) {
      this.yearSubmitted = yearSubmitted;
   }

   public int getMonthSubmitted() {
      return monthSubmitted;
   }

   public void setMonthSubmitted(int monthSubmitted) {
      this.monthSubmitted = monthSubmitted;
   }

   public int getDaySubmitted() {
      return daySubmitted;
   }

   public void setDaySubmitted(int daySubmitted) {
      this.daySubmitted = daySubmitted;
   }
}
