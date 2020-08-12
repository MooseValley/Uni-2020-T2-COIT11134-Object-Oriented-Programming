/*
Author: Mike OMalley
Source: Person.java
Desc:   Person class - abstract class.

*/
public abstract class Person
{
   public abstract String getDescription();

   private String name;

   public Person(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }
}
