/*
Author: Mike OMalley
Source: MyClass.java
Desc:   Demonstrate what toString() does when a class is not explicitly part of an inheritance hierarchy -
        it has no "public class ... extends ...".

*/
public class MyClass
{
   public static void main (String[] args)
   {
      MyClass my = new MyClass();
      System.out.println (my);  // Sample output by Object class's toString():  MyClass@2a139a55
   }

} // public class MyClass
