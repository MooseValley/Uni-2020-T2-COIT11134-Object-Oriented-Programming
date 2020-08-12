/*
Author: Mike OMalley
Source: SampleGUI.java
Desc:   Class Demo: build a simple GUI App from scratch in less than 5 minutes.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SampleGUI extends JFrame
{
   JLabel myLabel          = new JLabel ("Hello World");
   JButton myButton        = new JButton ("Change Label");
   JTextField myTextField  = new JTextField (10);

   public SampleGUI()
   {
      setLayout (new FlowLayout () );

      add (myLabel);
      add (myButton);
      add (myTextField);

      myButton.addActionListener (event -> changeLabel() );
   }

   private void changeLabel()
   {
      String inputStr = myTextField.getText();
      myLabel.setText (inputStr);
   }

   public static void main(String[] args)
   {
      SampleGUI app = new SampleGUI ();

      app.setVisible (true);
      app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      app.setSize (600, 400);

   }
}