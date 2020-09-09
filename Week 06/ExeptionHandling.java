/*
Author: Mike OMalley
Source: ExeptionHandling.java
Desc:   Examples and exploring Exeption Handling...
*/

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ExeptionHandling
{
   public static void main (String[] args)
   {
      /*
      try
      {
         int val = 100 / 0;
      }
      catch (ArithmeticException err)
      {
         //err.printStackTrace();
         //System.out.println ("ERROR: " + err.toString() );
         System.out.println ("ERROR: You cannot divide by zero.");
      }

      try
      {
         int val2 = Integer.parseInt ("123abc");
      }
      catch (NumberFormatException err)
      {
         System.out.println ("ERROR: " + err.toString() );
      }
      */






      Date today = new Date ();

      SimpleDateFormat YYYY_MM_DD_FORMATTER = new SimpleDateFormat ("yyyy-MM-dd");

      Date parsedDate = null;

      try
      {
         //parsedDate = YYYY_MM_DD_FORMATTER.parse("2017-08-17");
         parsedDate = YYYY_MM_DD_FORMATTER.parse("fred");

         int num = Integer.parseInt("123");
         double dbl = Double.parseDouble ("123.456");

      }
      catch (ParseException err)
      {
        // Generate error message ...
         System.out.println ("ERROR: Date is Not Valid." );
      }
      catch (NumberFormatException err)
      {
        // Generate error message ...
         System.out.println ("ERROR: Number is NOT valid." );
      }

      System.out.println (parsedDate);

/*
      // Validating a bunch of user inputs ...
      try
      {
         ::::
      }
      catch (:::)
      {
      }

      try
      {
         ::::
      }
      catch (:::)
      {
      }


      try
      {
         ::::
      }
      catch (:::)
      {
      }
*/

   }

}