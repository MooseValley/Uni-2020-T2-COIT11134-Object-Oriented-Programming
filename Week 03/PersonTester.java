public class PersonTester
{
   public static void main (String[] args)
   {
      // ERROR: cannot instantiate an Abstract class.
      Person p1 = new Person ("Frankie");
      System.out.println (p1.getName() );

      Student s1 = new Student ("Mike", "IT");
      System.out.println (s1.getName() + " " + s1.getDescription());
   }
}