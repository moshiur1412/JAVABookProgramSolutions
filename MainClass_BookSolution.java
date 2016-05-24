import java.util.Scanner;

public class MainClass_BookSolution {
	static Scanner snr = new Scanner(System.in);

	public static void main(String ar[]) {

		int input;

		do {

			System.out
					.println("=========================+++++++++++++=========================");
			System.out
					.println("------->>>>>>>> Welcome To Java Tutorial <<<<<<<<<-------------");
			System.out
					.println("===============================================================\n");

			System.out
					.println("       Part 1 :: Fundamentals of Programming\n");
			System.out
					.println("       Part 2 :: Object-Oriented Programming\n");
			System.out.println("       Part 3 :: GUI Programming \n");
			System.out
					.println("       Part 4 :: Data Structures and Algorithms\n");
			System.out.println("       Part 5 :: Advanced Java Programming\n");

			System.out
					.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

			System.out.println(" Enter Part Number :: Enter 0 for Exit ");
			input = snr.nextInt();

			switch (input) {
			case 1:
				Part1 prt1 = new Part1();
				prt1.Part1Display();

				break;
			case 2:
				Part2_Object_Oriented_Programming prt2 = new Part2_Object_Oriented_Programming();
				prt2.Part2_Display();

				break;

			}

		} while (input != 0);
		System.out.println("You have selected Exit, Thank you.");

	}

}
