import javax.swing.JOptionPane;
import java.util.Scanner;
public class Part1Chapter1{
public void Part1Chapter1Display(){
Scanner src= new Scanner(System.in);

	int input;
	do {


			System.out.println("___________________________________________________________________");
			System.out.println("_________>>>>>>> Part 1 :: Chapter 1 (ProgramList) <<<<<<<_________");
			System.out.println("===================================================================\n");

			//part 1 :: Chapter 1
			System.out.println("Program 1 :: LISTING 1.1 Welcome.java\n");
			System.out.println("Program 2 :: LISTING 1.2 Welcome1.java \n");
			System.out.println("Program 3 :: LISTING 1.3 ComputeExpression.java \n");
			System.out.println("Program 4 :: LISTING 1.4 WelcomeInMessageDialogBox.java\n");
			System.out.println("Program 5 :: ProEx (Displaying a pattern) \n");

			System.out.println("_____________________________________________________________________\n");
				System.out.println("Enter number for Listing :: 0 for Part 1_Chapter List");
				input = src.nextInt();

						switch (input){
							case 1:
							System.out.println("Welcome to java !!!" );
						break;
							case 2:
							System.out.println("Programming is fun !!!" );
							System.out.println("Fundamentals First !!!" );
							System.out.println("Problem Driven !!!" );
						break;
							case 3:
							System.out.println("ComputeExpression = "+(10.5+ 2 *3)/(45-3.4));
						break;
							case 4:
							JOptionPane.showMessageDialog(null,"Welcome to Java!!!");
						break;
							case 5:
							System.out.println("              J       A      V     V       A          ");
							System.out.println("              J      A A      V   V       A A         ");
							System.out.println("         J    J     AAAAA      V V       AAAAA        ");
							System.out.println("          J  J     A     A      V       A     A       ");
						break;

			}
		}while (input!=0);

	}


}