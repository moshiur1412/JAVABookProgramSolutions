import javax.swing.JOptionPane;
import java.util.Scanner;
public class Part1Chapter3{
public void Part1Chapter3Display(){
Scanner src= new Scanner(System.in);

	int inputValue;
	do {


			System.out.println("___________________________________________________________________");
			System.out.println("_________>>>>>>> Part 1 :: Chapter 3 (ProgramList) <<<<<<<_________");
			System.out.println("===================================================================\n");

			//part 1 :: Chapter 2
			System.out.println("Program 1 :: LISTING 3.1 AdditionQuiz.java\n");
			System.out.println("Program 2 :: LISTING 3.2 SimpleIfDemo.java \n");
			System.out.println("Program 3 :: LISTING 3.3 GuessBirthday.java\n");
			System.out.println("Program 4 :: LISTING 3.4 SubtractionQuiz.java\n");
			System.out.println("Program 5 :: LISTING 3.5 ComputeBMI.java \n");
			System.out.println("Program	6 :: LISTING 3.6 ComputeTax.java\n");
			System.out.println("Program	7 :: LISTING 3.7 TestBooleanOperators.java\n");
			System.out.println("Program	8 :: LISTING 3.8 LeapYear.java\n");
			System.out.println("Program	9 :: LISTING 3.9 Lottery.java\n");
			System.out.println("Program	10 :: LISTING 3.10 GuessBirthdayUsingConfirmationDialog.java\n");
			System.out.println("Program	11 :: LISTING 2.11 ComputeLoanUsingInputDialog.java\n");


			System.out.println("_____________________________________________________________________\n");
				System.out.println("Enter number for Listing :: 0 for Part 1_Chapter List");
				inputValue = src.nextInt();

						switch (inputValue){
							case 1:
							int number1 = (int)(System.currentTimeMillis() % 10);
							int number2 = (int)(System.currentTimeMillis() * 7 % 10);
							System.out.print("What is " + number1 + " + " + number2 + "? ");
							int answer = src.nextInt();
							System.out.println(number1 + " + " + number2 + " = " + answer + " is " +(number1 + number2 == answer));


						break;
							case 2:
							System.out.println("Enter an integer: ");
							int number = src.nextInt();
							if (number % 5 == 0)
							System.out.println("HiFive");
							if (number % 2 == 0)
							System.out.println("HiEven");

						break;
							case 3:
							String set1 =
							" 1 3 5 7\n" +
							" 9 11 13 15\n" +
							"17 19 21 23\n" +
							"25 27 29 31";
							String set2 =
							" 2 3 6 7\n" +
							"10 11 14 15\n" +
							"18 19 22 23\n" +
							"26 27 30 31";

							String set3 =
							" 4 5 6 7\n" +
							"12 13 14 15\n" +
							"20 21 22 23\n" +
							"28 29 30 31";
							String set4 =
							" 8 9 10 11\n" +
							"12 13 14 15\n" +
							"24 25 26 27\n" +
							"28 29 30 31";

							String set5 =
							"16 17 18 19\n" +
							"20 21 22 23\n" +
							"24 25 26 27\n" +
							"28 29 30 31";

							int day = 0;

							// Prompt the user to answer questions
							System.out.print("Is your birthday in Set1?\n");
							System.out.print(set1);
							System.out.print("\nEnter 0 for No and 1 for Yes: ");
							answer = src.nextInt();

							if (answer == 1)
							day += 1;

							// Prompt the user to answer questions
							System.out.print("\nIs your birthday in Set2?\n" );
							System.out.print(set2);
							System.out.print("\nEnter 0 for No and 1 for Yes: ");
							answer = src.nextInt();

							if (answer == 1)
							day += 2;
							// Prompt the user to answer questions
							System.out.print("Is your birthday in Set3?\n");
							System.out.print(set3);
							System.out.print("\nEnter 0 for No and 1 for Yes: ");
							answer = src.nextInt();

							if (answer == 1)
							day += 4;

							// Prompt the user to answer questions
							System.out.print("\nIs your birthday in Set4?\n");
							System.out.print(set4);
							System.out.print("\nEnter 0 for No and 1 for Yes: ");
							answer = src.nextInt();

							if (answer == 1)
							day += 8;
							// Prompt the user to answer questions
							System.out.print("\nIs your birthday in Set5?\n");
							System.out.print(set5);
							System.out.print("\nEnter 0 for No and 1 for Yes: ");
							answer = src.nextInt();
							if (answer == 1)
							day += 16;
							System.out.println("\nYour birthday is " + day + "!");

						break;
							case 4:
								// 1. Generate two random single-digit integers
								int number3 = (int)(Math.random() * 10);
								int number4 = (int)(Math.random() * 10);
								// 2. If number1 < number2, swap number1 with number2
								if (number3 < number4){
								int temp = number3;
								number3 = number4;
								number4 = temp;
								}

								// 3. Prompt the student to answer "What is number1 – number2?"
								System.out.print
								("What is " + number3 + " - " + number4 + "? ");
								int answer1 = src.nextInt();

								// 4. Grade the answer and display the result
								if (number3 - number4 == answer1)
								System.out.println("You are correct!");
								else
								System.out.println("Your answer is wrong\n" + number3 + " - " + number4 + " should be " + (number3 - number4));
						break;
							case 5:
								// Prompt the user to enter weight in pounds
								System.out.print("Enter weight in pounds: ");
								double weight = src.nextDouble();
								// Prompt the user to enter height in inches
								System.out.print("Enter height in inches: ");
								double height = src.nextDouble();
								final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
								final double METERS_PER_INCH = 0.0254; // Constant

								// Compute BMI
								double weightInKilograms = weight * KILOGRAMS_PER_POUND;
								double heightInMeters = height * METERS_PER_INCH;
								double bmi = weightInKilograms /
								(heightInMeters * heightInMeters);
								// Display result
								System.out.printf("Your BMI is %5.2f\n", bmi);
								if (bmi < 16)
								System.out.println("You are seriously underweight");
								else if (bmi < 18)
								System.out.println("You are underweight");
								else if (bmi < 24)
								System.out.println("You are normal weight");
								else if (bmi < 29)
								System.out.println("You are overweight");
								else if (bmi < 35)
								System.out.println("You are seriously overweight");
								else
								System.out.println("You are gravely overweight");
								break;
							case 6:
								// Prompt the user to enter filing status
								System.out.print(
								"(0-single filer, 1-married jointly,\n" +
								"2-married separately, 3-head of household)\n" +
								"Enter the filing status: ");
								int status = src.nextInt();

								// Prompt the user to enter taxable income
								System.out.print("Enter the taxable income: ");
								double income = src.nextDouble();

								// Compute tax
								double tax = 0;
								if (status == 0) {
								// Compute tax for single filers
								if (income <= 8350)
								tax = income * 0.10;
								else if (income <= 33950)
								tax = 8350 * 0.10 + (income - 8350) * 0.15;
								else if (income <= 82250)
								tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
								(income - 33950) * 0.25;
								else if (income <= 171550)
								tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
								(82250 - 33950) * 0.25 + (income - 82250) * 0.28;
								else if (income <= 372950)
								tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
								(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
								(income - 171550) * 0.35;
								else
								tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
								(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
								(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
								}
								else if (status == 1) {// Compute tax for married file jointly
								}// Left as exercise
								else if (status == 2) {
								// Compute tax for married separately
								// Left as exercise
								}
								else if (status == 3) {// Compute tax for head of household
								// Left as exercise
								}
								else {
								System.out.println("Error: invalid status");
								System.exit(0);
								}

								// Display the result
								System.out.println("Tax is " + (int)(tax * 100) / 100.0);

						break;
							case 7:
								// Receive an input
								System.out.print("Enter an integer: ");
								int number5 = src.nextInt();
								System.out.println("Is " + number5 +
								"\n\tdivisible by 2 and 3? " +
								(number5 % 2 == 0 && number5 % 3 == 0)
								+ "\n\tdivisible by 2 or 3? " +
								(number5 % 2 == 0 || number5 % 3 == 0)
								+"\n\tdivisible by 2 or 3, but not both? "
								+(number5 % 2 == 0 ^ number5 % 3 == 0));

						break;
							case 8:
								System.out.print("Enter a year: ");
								int year = src.nextInt();
								// Check if the year is a leap year
								boolean isLeapYear =(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
								// Display the result
								System.out.println(year + " is a leap year? " + isLeapYear);

						break;
							case 9:
							// Generate a lottery
							int lottery = (int)(Math.random() * 100);
							// Prompt the user to enter a guess

							System.out.print("Enter your lottery pick (two digits): ");
							int guess = src.nextInt();
							// Get digits from lottery
							int lotteryDigit1 = lottery / 10;
							int lotteryDigit2 = lottery % 10;

							// Get digits from guess
							int guessDigit1 = guess / 10;
							int guessDigit2 = guess % 10;
							System.out.println("The lottery number is " + lottery);
							// Check the guess
							if (guess == lottery)
							System.out.println("Exact match: you win $10,000");
							else if (guessDigit2 == lotteryDigit1
							&& guessDigit1 == lotteryDigit2)
							System.out.println("Match all digits: you win $3,000");
							else if (guessDigit1 == lotteryDigit1
							|| guessDigit1 == lotteryDigit2
							|| guessDigit2 == lotteryDigit1
							|| guessDigit2 == lotteryDigit2)
							System.out.println("Match one digit: you win $1,000");
							else
							System.out.println("Sorry, no match");
					break;
						case 10:
String set6 =
" 1 3 5 7\n" +
" 9 11 13 15\n" +
"17 19 21 23\n" +
"25 27 29 31";
String set7 =
" 2 3 6 7\n" +
"10 11 14 15\n" +
"18 19 22 23\n" +
"26 27 30 31";

String set8 =
" 4 5 6 7\n" +
"12 13 14 15\n" +
"20 21 22 23\n" +
"28 29 30 31";
String set9 =
" 8 9 10 11\n" +
"12 13 14 15\n" +
"24 25 26 27\n" +
"28 29 30 31";

String set10 =
"16 17 18 19\n" +
"20 21 22 23\n" +
"24 25 26 27\n" +
"28 29 30 31";

int day1 = 0;

// Prompt the user to answer questions

int answer2 = JOptionPane.showConfirmDialog(null,"Is your birthday in Set1?\n"+set6);
if (answer2 == JOptionPane.YES_OPTION)
day1 += 1;

// Prompt the user to answer questions
answer2 = JOptionPane.showConfirmDialog(null,"Is your birthday in Set2?\n"+set7);
if (answer2 == JOptionPane.YES_OPTION)
day1 += 2;

// Prompt the user to answer questions
answer2 = JOptionPane.showConfirmDialog(null,"Is your birthday in Set3?\n"+set8);
if (answer2 == JOptionPane.YES_OPTION)
day1 += 4;

// Prompt the user to answer questions
 answer2 = JOptionPane.showConfirmDialog(null,"Is your birthday in Set4?\n"+set9);
if (answer2 == JOptionPane.YES_OPTION)
day1 += 8;
// Prompt the user to answer questions
// Prompt the user to answer questions
answer2 = JOptionPane.showConfirmDialog(null,"Is your birthday in Set5?\n"+set10);
if (answer2 == JOptionPane.YES_OPTION)
day1 += 16;
JOptionPane.showMessageDialog(null, "Your birthday is " + day1 + "!");

					break;
						case 11:

					break;


			}
		}while (inputValue!=0);

	}


}