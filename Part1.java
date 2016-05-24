import java.util.Scanner;
public class Part1{
public void Part1Display (){
	Scanner src = new Scanner(System.in);
	int input;
	do{
		System.out.println("___________________________________________________________________");
		System.out.println("_______________>>>>>>> Part 1 :: Chapter List <<<<<<<______________");
		System.out.println("===================================================================\n");

		System.out.println("Chapter 1 :: Beginning programming of java\n");
		System.out.println("Chapter 2 :: Elementary Programming \n");
		System.out.println("Chapter 3 :: Selections \n");
		System.out.println("Chapter 4 :: Loops \n");
		System.out.println("Chapter 5 :: Methods \n");
		System.out.println("Chapter 6 :: Single-Dimensional Arrays \n");
		System.out.println("Chapter 7 :: Multidimensional Arrays \n");

		System.out.println("_____________________________________________________________________\n");
		System.out.println("Enter Number For Chapter :: 0 For Main Menu");
		input = src.nextInt();
			switch (input){
				case 1:
				Part1Chapter1 cpt1Cap1 = new Part1Chapter1();
				cpt1Cap1.Part1Chapter1Display();
			break;
				case 2:
				Part1Chapter2 cpt1Cap2 = new Part1Chapter2();
				cpt1Cap2.Part1Chapter2Display();
			break;
				case 3:
				Part1Chapter3 cpt1Cap3 = new Part1Chapter3();
				cpt1Cap3.Part1Chapter3Display();
			break;
				case 4:
				Part1Chapter4 cpt1Cap4 = new Part1Chapter4();
				cpt1Cap4.Part1Chapter4Display();
			break;
				case 5:
				Part1_Chapter5_Method cpt1Cap5 = new Part1_Chapter5_Method();
				cpt1Cap5.Part1_Chapter5_Display();
			break;
				case 6:
				Part1_Chapter6_Single_Dimensional_Arrays cpt1Cap6 = new Part1_Chapter6_Single_Dimensional_Arrays();
				cpt1Cap6.Part1_Chapter6_Single_Dimensional_Arrays_Display();
			break;
				case 7:
				Part1_Chapter7_Multidimensional_Arrays cpt1Cap7 = new Part1_Chapter7_Multidimensional_Arrays();
				cpt1Cap7.Part1_Chapter7_Multidimensional_Arrays_Display();
				break;

				}

	}while(input!=0);






	}

}