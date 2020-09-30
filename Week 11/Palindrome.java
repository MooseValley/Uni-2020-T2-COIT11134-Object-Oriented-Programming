/*
rotor
racecar

Won’t lovers revolt now
Doc, Note: I Dissent. A Fast Never Prevents A Fatness. I Diet On Cod.
Never Odd Or Even
Do Geese See God?
Was It A Rat I Saw?
Dammit, I’m Mad!!
A Santa Lived As a Devil At NASA
Mr. Owl Ate My Metal Worm
Madam In Eden, I’m Adam
A Man, A Plan, A Canal-Panama!

TODO: include phrases -
TODO: remove digits, punctuation, spaces, etc - only leave letters/

*/

import java.util.*;

public class Palindrome
{
   public static void main(String[] args)
   {
      String str = "racecar";  // "rotor";
      boolean palindrome = true; // Assume true and try and prove wrong.

      Stack<Character> charStack = new Stack<Character> ();
      for (int k = 0; k < str.length(); k++)
      {
         charStack.push (str.charAt (k) );
      }

      int index = 0;
      while ((charStack.empty() == false) && (palindrome == true) &&
             (index <= str.length() / 2) )
      {
         if (charStack.pop() != str.charAt (index++) )
            palindrome = false;

         //index++;
      }

      System.out.println ("Palindrome check for '" + str + "' result: " +
                          palindrome);


   }
}