import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Zooniverse extends JFrame
{
   private JTextField animalCommonNameTextField = new JTextField (20);
   private JButton    searchButton              = new JButton ("Search");
   private JButton    displayButton             = new JButton ("Display All");
   private JLabel     resultLabel               = new JLabel  ();

   private ArrayListGeneric<Zoo> zoo            = new ArrayListGeneric<Zoo>();


   public Zooniverse ()
   {
      setLayout (new GridLayout (4, 2) ); //R,C

      add (new JLabel ("Animal Common Name: ") );
      add (animalCommonNameTextField);
      add (searchButton);
      add (resultLabel);
      add (displayButton);

      searchButton.addActionListener  (event -> searchAnimalCommonName () );
      displayButton.addActionListener (event -> displayAll () );

      addTestData();
   }

   private void addTestData()
   {
      zoo.add (new Zoo ("Lion") );
      zoo.add (new Zoo ("Tiger") );
      zoo.add (new Zoo ("Platypus") );
   }

   private void displayAll ()
   {
      JOptionPane.showMessageDialog (null, zoo.toString() );
   }

   private void searchAnimalCommonName ()
   {
      // Call the search method in the ArrayListGeneric class
      // passing in the user input in the animalCommonNameTextField
      // and getting the results back and displaying them in resultLabel

      // TODO: validations: arraylist not null, user typed something in, etc

      int result = zoo.search (animalCommonNameTextField.getText() );
      resultLabel.setText ("result: " + result);
   }

   public static void main (String[] args)
   {
      Zooniverse app = new Zooniverse ();
      app.setSize (500, 400);
      app.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
      app.setVisible (true);
   }
}