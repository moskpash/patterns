package ru.moskpash.facade;

public class Employee {

     private Double salaryPerHour;
     private String name;
     private String position;

     public Employee(Double salaryPerHour, String name, String position) {
          this.salaryPerHour = salaryPerHour;
          this.name = name;
          this.position = position;
     }

     public Double getSalaryPerHour() {
          return salaryPerHour;
     }

     public void setSalaryPerHour(Double salaryPerHour) {
          this.salaryPerHour = salaryPerHour;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getPosition() {
          return position;
     }

     public void setPosition(String position) {
          this.position = position;
     }
}
