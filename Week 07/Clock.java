/*
Author: Mike OMalley
Source: Clock.java
Desc:   Use a timer to display the time each second in the console window.
*/

import java.awt.Toolkit;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Clock
{
   public static void main (String[] args)
   {
      Timer timer = new Timer (1000, event -> displayTime () );
      timer.start();
      JOptionPane.showMessageDialog (null, "Keeping console window open so timer can run ...");
   }

   private static void displayTime ()
   {
      System.out.println (new Date() );
      Toolkit.getDefaultToolkit().beep();
   }
}