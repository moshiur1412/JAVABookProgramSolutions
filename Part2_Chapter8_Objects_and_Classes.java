import javax.swing.*;

import java.util.Scanner;

public class Part2_Chapter8_Objects_and_Classes{
	static Scanner src = new Scanner(System.in);

	public void Part2_Chapter8_Display() {

		int inputValue;
		do {

			System.out.println("\n_____________________________________________________________________");
			System.out.println(">>>  Part 2 :: Chapter 8 # Objects and Classes # (ProgramList)  <<<");
			System.out.println("=====================================================================\n");

			System.out.println("Program 1 :: LISTING 8.1 TestCircle1.java\n");
			System.out.println("Program 2 :: LISTING 8.2 Circle1.java \n");
			System.out.println("Program 3 :: LISTING 8.4 TestTV.java\n");
			System.out.println("Program 4 :: LISTING 8.5 TestFrame.java\n");
			System.out.println("Program 5 :: LISTING 8.6 GUIComponents.java\n");
			System.out.println("Program	6 :: LISTING 7.6 GuessBirthdayUsingArray.java\n");

			System.out.println("_____________________________________________________________________\n");
			System.out.println("Enter number for Listing :: 0 for Part 2_Chapter List");
			inputValue = src.nextInt();

			switch (inputValue) {
			case 1:
				// Create a circle with radius 1.0
				Circle1 circle1 = new Circle1();
				System.out.println("The area of the circle of radius "
						+ circle1.radius + " is " + circle1.getArea());

				// Create a circle with radius 25
				Circle1 circle2 = new Circle1(25);
				System.out.println("The area of the circle of radius "
						+ circle2.radius + " is " + circle2.getArea());

				// Create a circle with radius 125
				Circle1 circle3 = new Circle1(125);
				System.out.println("The area of the circle of radius "
						+ circle3.radius + " is " + circle3.getArea());

				// Modify circle radius
				circle2.radius = 100;
				System.out.println("The area of the circle of radius "
						+ circle2.radius + " is " + circle2.getArea());
				break;
			case 2:

				break;
			case 3:
				TV tv1 = new TV();
				tv1.turnOn();
				tv1.setChannel(30);
				tv1.setVolume(3);

				TV tv2 = new TV();
				tv2.turnOn();
				tv2.channelUp();
				tv2.channelUp();
				tv2.volumeUp();
				System.out.println("tv1's channel is " + tv1.channel
						+ " and volume level is " + tv1.volumeLevel);

				System.out.println("tv2's channel is " + tv2.channel
						+ " and volume level is " + tv2.volumeLevel);
				break;
			case 4:
				JFrame frame1 = new JFrame();
					frame1.setTitle("Window 1");
					frame1.setSize(200, 150);
					frame1.setLocation(200, 100);
					//frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame1.setVisible(true);

					JFrame frame2 = new JFrame();
					frame2.setTitle("Window 2");
					frame2.setSize(200, 150);
					frame2.setLocation(410, 100);
					//frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame2.setVisible(true);
				break;
			case 5:

    // Create a button with text OK
   				 JButton jbtOK = new JButton("OK");

   				 // Create a button with text Cancel
   				 JButton jbtCancel = new JButton("Cancel");

   				 // Create a label with text "Enter your name: "
   				 JLabel jlblName = new JLabel("Enter your name: ");

   				 // Create a text field with text "Type Name Here"
   				 JTextField jtfName = new JTextField("Type Name Here");

   				 // Create a check box with text bold
   				 JCheckBox jchkBold = new JCheckBox("Bold");

   				 // Create a check box with text italic
   				 JCheckBox jchkItalic = new JCheckBox("Italic");

   				 // Create a radio button with text red
   				 JRadioButton jrbRed = new JRadioButton("Red");

   				 // Create a radio button with text yellow
   				 JRadioButton jrbYellow = new JRadioButton("Yellow");

   				 // Create a combo box with several choices
   				 JComboBox jcboColor = new JComboBox(new String[]{"Freshman","Sophomore", "Junior", "Senior"});

   				 // Create a panel to group components
   				 JPanel panel = new JPanel();
   				 panel.add(jbtOK); // Add the OK button to the panel
   				 panel.add(jbtCancel); // Add the Cancel button to the panel
   				 panel.add(jlblName); // Add the label to the panel
   				 panel.add(jtfName); // Add the text field to the panel
   				 panel.add(jchkBold); // Add the check box to the panel
   				 panel.add(jchkItalic); // Add the check box to the panel
   				 panel.add(jrbRed); // Add the radio button to the panel
   				 panel.add(jrbYellow); // Add the radio button to the panel
   				 panel.add(jcboColor); // Add the combo box to the panel

   				 JFrame frame = new JFrame(); // Create a frame
   				 frame.add(panel); // Add the panel to the frame
   				 frame.setTitle("Show GUI Components");
   				 frame.setSize(450, 100);
   				 frame.setLocation(200, 100);
   				 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   				 frame.setVisible(true);


   				break;

			}// end switch : case >>

		} while (inputValue != 0);

	}// end display method...

	// ---------CASE 1 --------- // Define the circle class with two
	// constructors
	class Circle1 {
		double radius;

		/** Construct a circle with radius 1 */
		Circle1() {
			radius = 1.0;
		}

		/** Construct a circle with a specified radius */
		Circle1(double newRadius) {
			radius = newRadius;
		}

		/** Return the area of this circle */
		double getArea() {
			return radius * radius * Math.PI;
		}
	}

	// -------------Case 3 -----------// Class declare---->>>
	public class TV {
		int channel = 1;// Default channel is 1
		int volumeLevel = 1;// Default volume level is 1
		boolean on = false;// By default TV is off

		public TV() {

		}

		public void turnOn() {
			on = true;
		}

		public void turnOff() {
			on = false;
		}

		public void setChannel(int newChannel) {
			if (on && newChannel >= 1 && newChannel <= 120)
				channel = newChannel;
		}

		public void setVolume(int newVolumeLevel) {
			if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
				volumeLevel = newVolumeLevel;

		}

		public void channelUp() {
			if (on && channel < 120)
				channel++;
		}

		public void channelDown() {
			if (on && channel > 1)
				channel--;
		}

		public void volumeUp() {
			if (on && volumeLevel < 7)
				volumeLevel++;
		}

		public void volumeDown() {
			if (on && volumeLevel > 1)
				volumeLevel--;
		}
	}

}// end Class...