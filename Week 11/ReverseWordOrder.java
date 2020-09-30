import java.util.*;

public class ReverseWordOrder
{
   public static void main(String[] args)
   {
      String[] wordsList = {"Java", "Jet Ski", "Quad Bike", "Horse" };

      // Put words onto SOMETHING
      // Get them back in Reverse Order
      // Put them into some structure LIFO ...  Stack

      Stack<String> wordsStack = new Stack<String> ();

      for (int k = 0; k < wordsList.length; k++)
      {
         wordsStack.push (wordsList[k]);
      }

      while (wordsStack.empty() == false)
      {
         System.out.println (wordsStack.pop() );
      }


   }
}