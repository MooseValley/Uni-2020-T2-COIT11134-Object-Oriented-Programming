/*
Author: Mike OMalley
Source: OverLoadTest.java
Desc:   Overloaded methods and converting them to Generic methods.
*/

import java.util.Date;

public class OverLoadTest
{
   /*
   private static void printMarks(Float a1, Float a2)
   {
      System.out.println("printMarks (Float)\n\tAssignment1 = " +a1+"\n\tAssignment2 = "+ a2);
   }

   private static void printMarks(Double a1, Double a2)
   {
      System.out.println("printMarks (Double)\n\tAssignment1 = " +a1+"\n\tAssignment2 = "+ a2);
   }
   */

/*
   private static <T> void printMarks (T a1, T a2)
   {
      System.out.println("printMarks (T)\n\tAssignment1 = " +a1+"\n\tAssignment2 = "+ a2);
   }
*/

/*
   private static <Object> void printMarks (Object a1, Object a2)
   {
      System.out.println("printMarks (Object)\n\tAssignment1 = " +a1+"\n\tAssignment2 = "+ a2);
   }
*/


/*
   // Integer, Double, Float, String, Date, ...
   private static <T extends Comparable> void printMarks (T a1, T a2)
   {
      System.out.println("printMarks (T)\n\tAssignment1 = " +a1+"\n\tAssignment2 = "+ a2);
   }
*/

/*
   private static <T,U> void printMarks (T a1, U a2)
   {
      System.out.println("printMarks (T,U)\n\tAssignment1 = " +a1+"\n\tAssignment2 = "+ a2);
   }
*/


   private static <T> void printMarks (T a1, U a2)
   {
      System.out.println("printMarks (T,U)\n\tAssignment1 = " +a1+"\n\tAssignment2 = "+ a2);
   }



/*
   // Only numbers: Double, Integer, etc .... NOT Dates, Strings, etc ....
   private static <T extends Number> void printMarks (T a1, T a2)
   {
      System.out.println("printMarks (T)\n\tAssignment1 = " +a1+"\n\tAssignment2 = "+ a2);
   }
*/

   public static void main(String [] args)
   {
      Float  Subject1Assignment1Mark = 12.5f;
      Float  Subject1Assignment2Mark = 17.5f;
      Double Subject2Assignment1Mark = 14.25;
      Double Subject2Assignment2Mark = 16.75;

      System.out.println("Marks scored in Subject 1");
      printMarks(Subject1Assignment1Mark, Subject1Assignment2Mark);

      System.out.println("Marks scored in Subject 2");
      printMarks(Subject2Assignment1Mark, Subject2Assignment2Mark);

/*
      printMarks ("Mike", "Frankie");

      printMarks (new Date(), new Date());

      //printMarks (new Employee ("Mike", 20), new Employee ("Frankie", 23));

      printMarks ("Mike", new Date());

      printMarks (new Fish(), "and Chips" );

      //printMarks (employesArrayList, workHistoryLinkedList);
*/
   }
}
