import javax.swing.JOptionPane;
import java.util.Scanner;
public class Part1_Chapter6_Single_Dimensional_Arrays{
public void Part1_Chapter6_Single_Dimensional_Arrays_Display(){
Scanner src= new Scanner(System.in);

	int inputValue;
	do {


			System.out.println("\n_____________________________________________________________________");
			System.out.println(">>>Part 1 :: Chapter 6 # Single_Dimensional_Arrays # (ProgramList)<<<");
			System.out.println("=====================================================================\n");

			//part 1 :: Chapter 2
			System.out.println("Program 1 :: LISTING 6.1 LottoNumbers.java\n");
			System.out.println("Program 2 :: LISTING 6.2 DeckOfCards.java \n");
			System.out.println("Program 3 :: LISTING 6.3 TestPassArray.java\n");
			System.out.println("Program 4 :: LISTING 6.4 CountLettersInArray.java\n");
			System.out.println("Program 5 :: LISTING 6.5 VarArgsDemo.java\n");
			System.out.println("Program	6 :: LISTING 6.6 LinearSearch.java\n");
			System.out.println("Program	7 :: LISTING 6.7 BinarySearch.java \n");
			System.out.println("Program	8 :: LISTING 6.8 SelectionSort.java\n");
			System.out.println("Program	9 :: LISTING 6.9 InsertionSort.java\n");


			System.out.println("_____________________________________________________________________\n");
				System.out.println("Enter number for Listing :: 0 for Part 1_Chapter List");
				inputValue = src.nextInt();

						switch (inputValue){
							case 1:
							boolean[] isCovered = new boolean[99]; // Default is false
							// Read each number and mark its corresponding element covered
							int number = src.nextInt();
							while (number != 0) {
							isCovered[number - 1] = true;
							number = src.nextInt();
							}

							// Check whether all covered
							boolean allCovered = true; // Assume all covered initially
							for (int i = 0; i < 99; i++)
							if (!isCovered[i]) {
							allCovered = false; // Find one number not covered
							break;
							}

							// Display result
							if (allCovered)
							System.out.println("The tickets cover all numbers");
							else
							System.out.println("The tickets don't cover all numbers");

						break;
							case 2:
							//LISTING 6.2 DeckOfCards.java
							int[] deck = new int[52];
							String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
							String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King"};

							// Initialize cards
							for (int i = 0; i < deck.length; i++)
							deck[i] = i;

							// Shuffle the cards
							for (int i = 0; i < deck.length; i++) {
							// Generate an index randomly
							int index = (int)(Math.random() * deck.length);
							int temp = deck[i];
							deck[i] = deck[index];
							deck[index] = temp;
							}

							// Display the first four cards
							for (int i = 0; i < 4; i++) {
							String suit = suits[deck[i] / 13];
							String rank = ranks[deck[i] % 13];
							System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
							}

						break;
							case 3:
							int[] a = {1, 2};
							// Swap elements using the swap method
							System.out.println("Before invoking swap");
							System.out.println("array is {" + a[0] + ", " + a[1] + "}");
							swap(a[0], a[1]);

							System.out.println("After invoking swap");
							System.out.println("array is {" + a[0] + ", " + a[1] + "}");

							// Swap elements using the swapFirstTwoInArray method
							System.out.println("Before invoking swapFirstTwoInArray");
							System.out.println("array is {" + a[0] + ", " + a[1] + "}");
							swapFirstTwoInArray(a);

							System.out.println("After invoking swapFirstTwoInArray");
							System.out.println("array is {" + a[0] + ", " + a[1] + "}");
						break;
							case 4:
							// Declare and create an array
							char[] chars = createArray();

							// Display the array
							System.out.println("The lowercase letters are:");
							displayArray(chars);

							// Count the occurrences of each letter
							int[] counts =countLetters(chars) ;

							// Display counts
							System.out.println();
							System.out.println("The occurrences of each letter are:");
							displayCounts(counts);
						break;
							case 5:
							printMax(34, 3, 3, 2, 56.5);
							printMax(new double[]{1, 2, 3});

						break;
							case 6:

						}//end switch : case >>


		}while (inputValue!=0);

	}//end display method...


					/** Swap two variables */
					public static void swap(int n1, int n2) {
					int temp = n1;
					n1 = n2;
					n2 = temp;
					}

					/** Swap the first two elements in the array */
					public static void swapFirstTwoInArray(int[] array){
					int temp = array[0];
					array[0] = array[1];
					array[1] = temp;
					}



					//case 4 Method

					/** Create an array of characters */
				public static char[] createArray(){
					// Declare an array of characters and create it
					char[] chars = new char[100];

					// Create lowercase letters randomly and assign
					// them to the array
					for (int i = 0; i < chars.length; i++)
					chars[i] = RandomCharacter.getRandomLowerCaseLetter();
					// Return the array
					return chars;
				}

					/** Display the array of characters */
				public static void displayArray(char[] chars){
					// Display the characters in the array 20 on each line
				for (int i = 0; i < chars.length; i++) {
					if ((i + 1) % 20 == 0)
					System.out.println(chars[i]);
					else
					System.out.print(chars[i] + " ");
				}
				}

					 /** Count the occurrences of each letter */
				public static int[] countLetters(char[] chars){
					 // Declare and create an array of 26 int
					 int[] counts = new int[26];

					 // For each lowercase letter in the array, count it
					 for (int i = 0; i < chars.length; i++)
					 counts[chars[i] - 'a']++;

					 return counts;
				}

					 /** Display counts */
				public static void displayCounts(int[] counts) {
				for (int i = 0; i < counts.length; i++) {
					 if ((i + 1) % 10 == 0)
					 System.out.println(counts[i] + " " + (char)(i + 'a'));
					 else
					 System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
 				}
			}


			//-------------------case 5----------->>>
				public static void printMax(double... numbers ) {
					if (numbers.length == 0) {
					System.out.println("No argument passed");
					return;
					}
					double result = numbers[0];
					for (int i = 1; i < numbers.length; i++)
					if (numbers[i] > result)
					result = numbers[i];
					System.out.println("The max value is " + result);
				}



}//end Class...