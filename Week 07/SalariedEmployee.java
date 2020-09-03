public class SalariedEmployee extends Employee
{
   private double hourlyRate;
   private double hoursWorked;

   // Students to add: constructors, accessors, mutators, toString, compareTo methods ...

   public SalariedEmployee (String firstName,  String lastName,   String socialSecurityNumber,
                            double hourlyRate, double hoursWorked)
   {
      this.hourlyRate  = hourlyRate;
      this.hoursWorked = hoursWorked;
   }

   @Override
   public double getPaymentAmount()
   {
      return hourlyRate * hoursWorked;
   }
}