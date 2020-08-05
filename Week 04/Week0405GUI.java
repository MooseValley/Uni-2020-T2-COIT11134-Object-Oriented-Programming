/*
Author: Mike OMalley
Source: Week0405GUI.java
Desc:   Develop a basic GUI user interface using the components as
        we cover them in the Week 04+05 lecture classes.

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Week0405GUI extends JFrame
{
   public static final int NUM_ROWS  = 3;
   public static final int NUM_COLS  = 4;
   public static final Image icon    = new ImageIcon ("images/Felix head smiling__140x140.png").getImage();

   JButton myButton1        = new JButton ("Button 1");
   JButton myButton2        = new JButton ("Button 2");
   JButton myButton3        = new JButton ("Button 3");
   JButton[] buttons        = new JButton [NUM_ROWS * NUM_COLS];
   JTextArea myTextArea     = new JTextArea();
   JScrollPane myScrollPane = new JScrollPane (myTextArea);
   JSlider slider           = new JSlider (SwingConstants.VERTICAL, 0, 100, 25);

   public Week0405GUI ()
   {
      // Comments are OK
      //super ("More GUI v0.00001");

      //createMainFrame ();
      //pack();

      JPanel buttonsPanel = new JPanel (new FlowLayout (FlowLayout.CENTER) );
      JPanel gridPanel    = new JPanel (new GridLayout (NUM_ROWS, NUM_COLS) );  //R,C, hGap, vGap

      buttonsPanel.add (myButton1);
      buttonsPanel.add (myButton2);
      buttonsPanel.add (new JLabel ("  ") );
      buttonsPanel.add (myButton3);

      add (buttonsPanel, BorderLayout.SOUTH);


      // Create the Grid Panel:

      for (int k = 0; k < buttons.length; k++)
      {
          buttons[k] = new JButton ("Button " + (k+1) );
          gridPanel.add (buttons[k]);

          //buttons[k].addActionListener (event -> .........);
      }

      add (gridPanel, BorderLayout.NORTH);


     // JTextPane
     myScrollPane.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
     add (myScrollPane, BorderLayout.CENTER);

     //myTextArea.setEditable (false);

     pack();

     add (slider, BorderLayout.WEST);

   }

   public void createMainFrame ()
   {
      /*
      setTitle ("More GUI v0.00001");
      setSize  (600, 600);
      setLocation (200, 200);
      //app.setResizable (false);
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      setVisible (true);

      Image icon = new ImageIcon ("images/Felix head smiling__140x140.png").getImage();
      setIconImage (icon);
      */
   }


/*
   public void paintComponent (Graphics g)
   {
      g.drawImage (icon, 0, 0, null);
   }

*/

   public static void main (String[] args)
   {
      //Week0405GUI app = new Week0405GUI();

      //new Week0405GUI();

      /*
      app.setTitle ("More GUI v0.00001");
      app.setSize  (600, 600);
      app.setLocation (200, 200);
      //app.setResizable (false);
      app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      app.setVisible (true);

      Image icon = new ImageIcon ("images/Felix head smiling__140x140.png").getImage();
      app.setIconImage (icon);
      */


      EventQueue.invokeLater ( () ->
         {
            Week0405GUI app = new Week0405GUI();

            app.setTitle ("More GUI v0.00001");
            app.setSize  (600, 600);
            app.setLocation (200, 200);
            //app.setResizable (false);
            app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
            app.setVisible (true);

            Image icon = new ImageIcon ("images/Felix head smiling__140x140.png").getImage();
            app.setIconImage (icon);
         });


   }

} // public class Week0405GUI