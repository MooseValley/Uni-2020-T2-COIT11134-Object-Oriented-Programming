/*

Mike O fixed / added:
* Default Constructor.
* @Override for equals() method.
* default date if no date supplied: 01-01-2000.
* @Override for getSalary() method.
*/
public class Manager extends Employee
{
   private double bonus;

   public Manager ()
   {
      //super ("", 0, 0, 0, 0);
      //bonus = 0;
      this ("", 0, 2000, 01, 01, 0);
   }

   public Manager (String name, double salary, int year, int month, int day)
   {
      //super (name, salary, year, month, day);
      //bonus = 0;
      this (name, salary, year, month, day, 0);
   }

   public Manager (String name, double salary, int year, int month, int day, double bonus)
   {
      // Call super
      super (name, salary, year, month, day);
      this.bonus = bonus;
   }

   public Manager (String name, int year, int month, int day)
   {
      //super (name, 0, year, month, day);
      //bonus = 0;
      this (name, 0, year, month, day, 0);
   }

   public void setBonus (double bonus)
   {
      this.bonus = bonus;
   }

   @Override
   public double getSalary ()
   {
      //return salary + bonus;   // ERROR
      return super.getSalary() + bonus;
   }

   @Override
   public boolean equals(Object otherObject)
   {
      if (super.equals(otherObject) == false)
         return false;

      Manager other = (Manager) otherObject;

      // super.equals checked that this and other belong to the same class
      return bonus == other.bonus;
   }

   @Override
   public String toString()
   {
      return super.toString() + "[bonus=" + bonus + "]";
   }

} // public class Manager extends Employee
