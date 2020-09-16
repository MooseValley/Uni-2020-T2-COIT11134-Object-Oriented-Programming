/*

TODO:
save
load

*/
import java.util.ArrayList;

public class ArrayListGeneric <T extends ArrayListGenericInterface>
{
   ArrayList<T> arrayList;

   public ArrayListGeneric ()
   {
      arrayList = new ArrayList<T>();
   }

   public void add (T object)
   {
      if (object != null)
         arrayList.add (object);
   }


   public int search (String searchStr)
   {
      int result = -1; // Not found

      for (int k = 0; k < arrayList.size(); k++)
      {
         if (searchStr.compareTo (arrayList.get(k).getSearchTerm()) == 0)
         {
            result = k;
            k      = arrayList.size(); // Exit Loop
         }
      }

      return result;
   }

   @Override
   public String toString()
   {
      String outputStr = "";

      for (int k = 0; k < arrayList.size(); k++)
      {
         outputStr += arrayList.get(k).toString() + "\n";
      }

      return outputStr;
   }
}