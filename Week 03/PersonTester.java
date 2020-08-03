public class PersonTester
{
   public static void main (String[] args)
   {
      // Cannot instantiate / create objects of the class because Person is Abstract
      //Person p1 = new Person ("Mike");

      // This is perfectly OK:
      Student s1 = new Student ("Frankie", "IT");
      System.out.println (s1.getName() + " " + s1.getDescription() );

   }
}