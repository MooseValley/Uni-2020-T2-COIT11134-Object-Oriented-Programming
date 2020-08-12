/*
Author: Mike OMalley
Source: Employee.java
Desc:   From Week 02 - with a Copy Constructor added.


Mike O fixed / added:
* Default Constructor.
* @Override for equals() method.
* default date if no date supplied: 01-01-2000.
*/

import java.time.*;
import java.util.Objects;

public class Employee
{
   private String name;
   private double salary;
   private LocalDate hireDay;

   // Default Constructor
   public Employee()
   {
      this ("", 0, 2000, 01, 01);
   }

   // Parameterised Constructor
   public Employee(String name, double salary, int year, int month, int day)
   {
      this.name = name;
      this.salary = salary;
      hireDay = LocalDate.of(year, month, day);
   }

   public Employee (Employee emp)
   {
      name    = emp.getName();   // Safe because String is IMMUTABLE
      salary  = emp.getSalary();

      // SAFE:
      hireDay = emp.getHireDay(); // Safe because it returns a COPY of the data

      // ERROR: WARNING !!!!  A reference to the data !!!
      //hireDay = emp.hireDay;
   }

   public String getName()
   {
      return name;
   }

   public void setHireDay (int year, int month, int day)
   {
      hireDay = LocalDate.of(year, month, day);
   }

   public double getSalary()
   {
      return salary;
   }

   public LocalDate getHireDay()
   {
      return hireDay; // OK for LocalDate.  Confirmed.
      // Normally: WARNING !!!!  A reference to the data !!!
      //return (LocalDate) hireDay.clone();  // Safe because it returns a COPY of the data
   }

   public void raiseSalary (double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   @Override
   public boolean equals (Object otherObject)
   {
      // a quick test to see if the objects are identical
      if (this == otherObject)
         return true;

      // must return false if the explicit parameter is null
      if (otherObject == null)
         return false;

      // if the classes don't match, they can't be equal
      if (getClass() != otherObject.getClass())
         return false;

      // now we know otherObject is a non-null Employee
      Employee other = (Employee) otherObject;

      // test whether the fields have identical values
      return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
   }

   @Override
   public String toString()
   {
      return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay
            + "]";
   }
} // public class Employee
