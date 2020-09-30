import java.util.Stack;
import java.util.Iterator;

class Employee
{
   private String name;
   private int    age;

   public Employee ()
   {
      this ("", 0);
   }

   public Employee (String name, int age)
   {
      this.name = name;
      this.age  = age;
   }

   public String toString()
   {
      return name + "\t" + age;
   }
}


public class StackActivity
{
   public static void main(String[] args)
   {
      Stack <Employee> emps = new Stack <Employee> ();

      emps.push (new Employee ("Mike",     99) );
      emps.push (new Employee ("Wayne",    23) );
      emps.push (new Employee ("Amy",      21) );
      emps.push (new Employee ("Nicholas", 22) );

      //System.out.println (emps.pop() ); // Nicholas




      // Does NOT work - retuns top item N times !
      //System.out.println ("\nPEEK #1 - size() and peek():");
      //for (int k = 0; k < emps.size(); k++)
      //{
      //   System.out.println (emps.peek() );
      //}

      System.out.println ("\nPEEK - for each:");
      for (Employee e : emps)
      {
         System.out.println (e);
      }

      System.out.println ("\nPEEK - Collections, Iterators:");
      Iterator iter = emps.iterator();
      while (iter.hasNext() == true)
      {
         System.out.println (iter.next() );
      }




      System.out.println ("\nPOP:");
      int size = emps.size();
      for (int k = 0; k < size; k++)
      {
         System.out.println (emps.pop() );
      }


   }
}