/*
Author: Mike OMalley
Source: LambdaExample.java
Desc:   NOTE: We need to cover more Java before we can use this Lambda expression.

Some useful articles / examples here:
* https://www.informit.com/articles/article.aspx?p=2303960&seqNum=4
* https://www.logicbig.com/how-to/java/lambda-list-contains-a-substring.html
* https://www.geeksforgeeks.org/lambda-expressions-java-8/
* https://www.baeldung.com/java-8-lambda-expressions-tips

*/
public class LambdaExample
{
   public static int compareStringLengths (String first, String second)
   {
      if (first.length() < second.length())
         return -1;
      else if (first.length() > second.length())
         return 1;
      else
         return 0;
   }

   public static void main (String[] args)
   {
/*
      // We need to cover more Java before we can use this Lambda expression:

      (String first, String second) ->
         {
            if (first.length() < second.length())
               return -1;
            else if (first.length() > second.length())
               return 1;
            else
               return 0;
         }

      // Use Lambda Exmpression:
      int result1 -> ("Mike", "Frankie");
*/
      // Invoke method:
      int result2 = compareStringLengths ("Mike", "Frankie");
      System.out.println (result);
   }
}
