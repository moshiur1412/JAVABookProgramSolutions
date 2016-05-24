import java.util.Scanner;

public class Part2_Object_Oriented_Programming {
	Scanner src = new Scanner(System.in);

	public void Part2_Display() {
		int input;
		do {
			System.out.println("\n___________________________________________________________________");
			System.out.println("_______________>>>>>>> Part 2 :: Chapter List <<<<<<<______________");
			System.out.println("===================================================================\n");

			System.out.println("Chapter 8 :: Objects and Classes\n");
			System.out.println("Chapter 9 :: Strings and Text I/O\n");
			System.out.println("Chapter 10 :: Thinking in Objects\n");
			System.out.println("Chapter 11 :: Inheritance and Polymorphism\n");
			System.out.println("Chapter 13 :: Exception Handling\n");
			System.out.println("Chapter 14 :: Abstract Classes and Interfaces \n");
			System.out.println("Chapter 19 :: Binary I/O\n");

			System.out.println("_____________________________________________________________________\n");
			System.out.println("Enter Number For Chapter :: 0 For Main Menu");
			input = src.nextInt();
			switch (input) {
			case 8:
				Part2_Chapter8_Objects_and_Classes cpt2Cap8 = new Part2_Chapter8_Objects_and_Classes();
				cpt2Cap8.Part2_Chapter8_Display();
				break;
			case 9:

				break;
			case 10:

			case 11:

				break;
			case 13:
				;
				break;
			case 14:

				break;
			case 19:

				break;

			}

		} while (input != 0);

	}

}
