public class Zoo implements ArrayListGenericInterface
{
   private String commonName;

   public Zoo ()
   {
      this ("");
   }

   public Zoo (String commonName)
   {
      this.commonName = commonName;
   }

   public String getCommonName()
   {
      return commonName;
   }

   public String getSearchTerm()
   {
      return commonName;
   }

   @Override
   public String toString()
   {
      return commonName;
   }

}