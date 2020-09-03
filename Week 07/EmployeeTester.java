public class EmployeeTester
{
   public static void main (String[] args)
   {
      SalariedEmployee se1 = new SalariedEmployee ("Mike", "O", "1234", 10.5, 48.5);

      System.out.println ("Payment: " + se1.getPaymentAmount() );
   }
}