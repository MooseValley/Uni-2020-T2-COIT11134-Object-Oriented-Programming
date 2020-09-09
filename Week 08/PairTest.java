/*
Author: Mike OMalley
Source: PairTest.java
Desc:   Test / demo our Generic classes.
*/

import java.util.Date;

public class PairTest
{
   public static void main (String[] args)
   {
      Pair pair1 = new Pair();
      System.out.println (pair1);

      // uses unchecked or unsafe operations.
      // Pair pair2 = new Pair ("Mike", "Frankie");

      Pair<String> pair2 = new Pair<String>("Mike", "Frankie");
      System.out.println (pair2);

      Pair<Date> pair3 = new Pair<Date>(new Date(), new Date());
      System.out.println (pair3);

      Pair<Fish> pair4 = new Pair<Fish>(new Fish(), new Fish());
      System.out.println (pair4);

      // Horrible BODGEY Code ???
      // Might be OK if you want to be able to store anything, anytime.
      // it keeps Java happy (no compile warnings).
      // ===> to shut java up from warnig us.
      Pair<Object> pair9 = new Pair<Object> ("Mike", new Fish());
      System.out.println (pair9);

      // Much, much better way to do it:  if you want to limit Pair2 objects to be String and Fish.
      Pair2 <String,Fish> pair20 = new Pair2<String,Fish> ("Mike", new Fish());
      System.out.println (pair20);


      // Java 7 ->  you can make the second <Fish> -> <>
      // Warning: uses unchecked or unsafe operations.
      //Pair pair14 = new Pair(new Fish(), new Fish());
      Pair<Fish> pair14 = new Pair<Fish>(new Fish(), new Fish());
      System.out.println (pair14);

   }
}