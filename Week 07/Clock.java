import javax.swing.*;


public class EmployeeTester
{
   public static void main (String[] args)
   {
      Timer timer = new Timer (1000, event -> displayTime () );
      timer.start()

   }

   private void displayTime ()
   {
      System.out.println (new Date() );
      Toolkit.getDefaultToolkit().beep();
   }
}
