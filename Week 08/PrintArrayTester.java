/*
Author: Mike OMalley
Source: PrintArrayTester.java
Desc:   Class activity - Generic Methods.
*/

import java.util.Arrays;

public class PrintArrayTester
{
   /*
   private static void printArray (int[] arr)
   {
      if (arr != null)
      {
         for (int k = 0; k < arr.length; k++)
         {
            System.out.print (arr[k] + ", ");
         }

         System.out.println ();
      }
   }

   private static void printArray (String[] arr)
   {
      if (arr != null)
      {
         for (int k = 0; k < arr.length; k++)
         {
            System.out.print (arr[k] + ", ");
         }

         System.out.println ();
      }
   }
   */

/*
   // Generic method:
   private static <T> void printArray (T[] arr)
   {
      if (arr != null)
      {
         for (int k = 0; k < arr.length; k++)
         {
            System.out.print (arr[k] + ", ");
         }

         System.out.println ();
      }
   }
*/

   public static <T> void printArray(T[] a1){
      //for(T i : a1){
      //System.out.println(java.util.Arrays.toString(a1));
      System.out.println(Arrays.toString(a1));
      //}
   }



   public static void main (String[] args)
   {
      /*
      Cannot use int, double, float, byte, boolean, ... or any other primitive types.
      Can only use Reference Types.
      If you int use Integer - the wrapper class version. (Autoboxing)
      */

      Integer[] arr1  = {10, 20, 15, 5};
      String[]  arr2  = {"Mike", "Frankie", "Bella", "Teenie"};
      String[]  arr3  = null;
      Character[] arr4 = {'T', 'e', 'e', 'n', 'i', 'e'};

      printArray (arr1);
      printArray (arr2);
      printArray (arr3);
      printArray (arr4);
   }
}