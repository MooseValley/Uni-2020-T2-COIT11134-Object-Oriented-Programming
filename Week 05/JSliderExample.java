/*
Author: Mike OMalley
Source: JSliderExample.java
Desc:   Show how to use a JSlider and update a label when the slider changes.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JSliderExample extends JFrame
{
   private JSlider mySlider     = new JSlider();
   private JLabel  myLabel      = new JLabel();

   public JSliderExample ()
   {
      JPanel flowPanel = new JPanel (new FlowLayout (FlowLayout.CENTER) );

      // add a slider with major and minor ticks
      mySlider.setMinimum (0);
      mySlider.setMaximum (100);
      mySlider.setPaintTicks (true);
      mySlider.setMajorTickSpacing (20);
      mySlider.setMinorTickSpacing (1);

      flowPanel.add (myLabel);

      add (mySlider,   BorderLayout.NORTH);
      add (flowPanel,  BorderLayout.SOUTH);

      mySlider.addChangeListener (event -> updateLabel() );

      updateLabel();
   }

   private void updateLabel()
   {
      myLabel.setText ("Slider: " + mySlider.getValue() );
   }

   public static void main (String[] args)
   {
      JSliderExample app = new JSliderExample();

      app.setTitle ("Slider Example v0.001");
      app.setSize     (600, 200);
      app.setLocation (200, 200);
      app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      app.setVisible (true);
   }
}