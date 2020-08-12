/*
Author: Mike OMalley
Source: EmployeeTester.java
Desc:   Tester class for Employee and Employee subclasses.
*/
public class EmployeeTester
{
   public static void main (String[] args)
   {
      Employee emp1 = new Employee ("Teenie Weenie", 3500, 2020, 07, 01);
      System.out.println (emp1);

      Employee emp2 = new Employee (emp1);
      System.out.println (emp2);

      // After change Hire Day:
      emp1.setHireDay (2019, 12, 12);
      System.out.println (emp1);
      System.out.println (emp2);


   }

} // public class EmployeeTester