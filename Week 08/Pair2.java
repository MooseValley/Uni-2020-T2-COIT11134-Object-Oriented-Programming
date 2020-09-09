/**
 * @version 1.00 2004-05-10
 * @author Cay Horstmann
 */
public class Pair2<T,U>
{
   private T first;
   private U second;

   public Pair2() { first = null; second = null; }
   public Pair2 ( T first, U second) { this.first = first;  this.second = second; }

   public T getFirst() { return first; }
   public U getSecond() { return second; }

   public void setFirst ( T newValue) { first = newValue; }
   public void setSecond ( U newValue) { second = newValue; }

   @Override
   public String toString()
   {
      return first + "\t" + second;
   }
}
