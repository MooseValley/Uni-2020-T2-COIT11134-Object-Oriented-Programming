public class PersonTester
{
   public static void main (String[] args)
   {
      // ERROR: cannot instantiate an Abstract class.
      //Person p1 = new Person ("Frankie");
      //System.out.println (p1.getName() );

      Student s1 = new Student ("Mike", "IT");
      System.out.println (s1.getName() + " " + s1.getDescription());

      if (s1 instanceof Person)
         System.out.println (s1.getName() + " is a Person");

      if (s1 instanceof Student)
         System.out.println (s1.getName() + " is a Student");
   }
}