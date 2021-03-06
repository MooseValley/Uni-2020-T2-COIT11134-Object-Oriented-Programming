/*
Author: Mike OMalley
Source: MultipleCenterPanelsControlledByButtonsCardLayout.java
Desc:   This code builds a very simple GUI with 3 main panels, which are controlled
        by 3 buttons.  Click button 1 and panel 1 is shown, and so on.

        Uses CardLayout.

        This type of design could / should be used by students to avoid having multiple JFrames,
        because this design is a LOT cleaner / simpler, this design is far more scalable,
        there's no need to pass data around between classes, etc.

        It is highly recommended that students Story Board their GUI designs (panels, components, etc)
        and name them with nice meaningful names, and then write the code to support their design.
        This will ensure the smoothest path to success.


Ammendment History
Ver   Date        Author    Details
----- ----------- --------  ----------------------------------------------------
0.002 15-Aug-2020  Mike O   Fix issue where the panel was not showing up on app startup when
                            showPanel ("panel1") was called et the end of the Constructor.
                            Issue was because I was creating wrong class object in main
                            (I somehow missed changing the class name when I copied and renamed
                            the other example class):
                              MultipleCenterPanelsControlledByButtons app = new MultipleCenterPanelsControlledByButtons();
                            sould be:
                              MultipleCenterPanelsControlledByButtonsCardLayout app = new MultipleCenterPanelsControlledByButtonsCardLayout();

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultipleCenterPanelsControlledByButtonsCardLayout extends JFrame
{
   private JPanel      cardLayoutPanel                 = new JPanel (new CardLayout());
   private CardLayout  cardLayout                      = (CardLayout)(cardLayoutPanel.getLayout() );

   private JButton showPanel1Button = new JButton ("Panel 1");
   private JButton showPanel2Button = new JButton ("Panel 2");
   private JButton showPanel3Button = new JButton ("Panel 3");

   //private JPanel  mainCenterPanel   = new JPanel (new BorderLayout () );

   private JPanel  panel1            = new JPanel ();
   private JPanel  panel2            = new JPanel ();
   private JPanel  panel3            = new JPanel ();

   // Panel 1 components
   JLabel myLabel1                   = new JLabel ("Label for Panel 1");
   JLabel myButton1                  = new JLabel ("Button for Panel 1");
   JTextField myTextField1           = new JTextField (20);

   // Panel 2 components
   JLabel myLabel2                   = new JLabel ("Label for Panel 2");
   JLabel myButton2                  = new JLabel ("Button for Panel 2");
   JTextField myTextField2           = new JTextField (20);

   // Panel 3 components
   JLabel myLabel3                   = new JLabel ("Label for Panel 3");
   JLabel myButton3                  = new JLabel ("Button for Panel 3");
   JTextField myTextField3           = new JTextField (20);


   public MultipleCenterPanelsControlledByButtonsCardLayout ()
   {
      createPanel1 ();
      createPanel2 ();
      createPanel3 ();

      JPanel buttonPanel = new JPanel (new FlowLayout (FlowLayout.CENTER) );

      buttonPanel.add (showPanel1Button);
      buttonPanel.add (showPanel2Button);
      buttonPanel.add (showPanel3Button);

      cardLayoutPanel.add (panel1, "panel1");
      cardLayoutPanel.add (panel2, "panel2");
      cardLayoutPanel.add (panel3, "panel3");

      add (cardLayoutPanel,  BorderLayout.CENTER);

      //add (mainCenterPanel, BorderLayout.CENTER);
      add (buttonPanel,     BorderLayout.SOUTH);

      /*
      showPanel1Button.addActionListener (event -> showPanel1 () );
      showPanel2Button.addActionListener (event -> showPanel2 () );
      showPanel3Button.addActionListener (event -> showPanel3 () );
      */

      showPanel1Button.addActionListener (event -> showPanel ("panel1") );
      showPanel2Button.addActionListener (event -> showPanel ("panel2") );
      showPanel3Button.addActionListener (event -> showPanel ("panel3") );

      showPanel ("panel1");
   }

   private void createPanel1 ()
   {
      panel1.setLayout (new FlowLayout (FlowLayout.CENTER) );
      panel1.add (myLabel1);
      panel1.add (myTextField1);
      panel1.add (myButton1);
   }

   private void createPanel2 ()
   {
      panel2.setLayout (new GridLayout (3, 1) ); // R,C
      panel2.add (myLabel2);
      panel2.add (myTextField2);
      panel2.add (myButton2);
   }

   private void createPanel3 ()
   {
      panel3.setLayout (new GridLayout (1, 3) ); // R,C
      panel3.add (myLabel3);
      panel3.add (myTextField3);
      panel3.add (myButton3);
   }

   /*
   private void showPanel1 ()
   {
      //mainCenterPanel.removeAll ();
      //mainCenterPanel.add (panel1, BorderLayout.CENTER);
      //mainCenterPanel.revalidate();
      //mainCenterPanel.repaint();
      cardLayout.show(cardLayoutPanel, "panel1");
   }

   private void showPanel2 ()
   {
      //mainCenterPanel.removeAll ();
      //mainCenterPanel.add (panel2, BorderLayout.CENTER);
      //mainCenterPanel.revalidate();
      //mainCenterPanel.repaint();
      cardLayout.show(cardLayoutPanel, "panel2");
   }

   private void showPanel3 ()
   {
      //mainCenterPanel.removeAll ();
      //mainCenterPanel.add (panel3, BorderLayout.CENTER);
      //mainCenterPanel.revalidate();
      //mainCenterPanel.repaint();
      cardLayout.show(cardLayoutPanel, "panel3");
   }
   */

   private void showPanel (String panelStr)
   {
      cardLayout.show(cardLayoutPanel, panelStr);
   }

   public static void main (String[] args)
   {
      MultipleCenterPanelsControlledByButtonsCardLayout app = new MultipleCenterPanelsControlledByButtonsCardLayout();

      app.setTitle    ("Multiple Center Panels v0.002");
      app.setSize     (600, 200);
      app.setLocation (200, 200);
      app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      app.setVisible  (true);
   }
}