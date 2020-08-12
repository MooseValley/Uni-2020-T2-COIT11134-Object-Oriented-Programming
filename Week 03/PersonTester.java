/*
Author: Mike OMalley
Source: PersonTester.java
Desc:   Runner / tester class

*/
public class PersonTester
{
   public static void main (String[] args)
   {
      // ERROR: Cannot instantiate / create Person objects because Person class is Abstract.
      //Person p1 = new Person ("Mike");
      //System.out.println (p1.getName() );


      // This is perfectly OK:
      Student s1 = new Student ("Frankie", "IT");
      System.out.println (s1.getName() + " " + s1.getDescription() );

      Student s1 = new Student ("Mike", "IT");
      System.out.println (s1.getName() + " " + s1.getDescription());

      if (s1 instanceof Person)
         System.out.println (s1.getName() + " is a Person");

      if (s1 instanceof Student)
         System.out.println (s1.getName() + " is a Student");
   }
}