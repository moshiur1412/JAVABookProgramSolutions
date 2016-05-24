import javax.swing.JOptionPane;
import java.util.Scanner;
public class Part1Chapter4{
public void Part1Chapter4Display(){
Scanner src= new Scanner(System.in);

	int inputValue;
	do {


			System.out.println("___________________________________________________________________");
			System.out.println("_________>>>>>>> Part 1 :: Chapter 4 (ProgramList) <<<<<<<_________");
			System.out.println("===================================================================\n");

			//part 1 :: Chapter 2
			System.out.println("Program 1 :: LISTING 4.1 GuessNumberOneTime.java\n");
			System.out.println("Program 2 :: LISTING 4.2 GuessNumber.java \n");
			System.out.println("Program 3 :: LISTING 4.3 SubtractionQuizLoop.java\n");
			System.out.println("Program 4 :: LISTING 4.4 SentinelValue.java\n");
			System.out.println("Program 5 :: LISTING 4.5 TestDoWhile.java \n");
			System.out.println("Program	6 :: LISTING 4.6 MultiplicationTable.java\n");
			System.out.println("Program	7 :: LISTING 4.7 TestSum.java \n");
			System.out.println("Program	8 :: LISTING 4.8 GreatestCommonDivisor.java\n");
			System.out.println("Program	9 :: LISTING 4.9 FutureTuition.java\n");
			System.out.println("Program	10 :: LISTING 4.10 MonteCarloSimulation.java\n");
			System.out.println("Program	11 :: LISTING 4.11 TestBreak.java\n");
			System.out.println("Program	12 :: LISTING 4.12 TestContinue.java\n");
			System.out.println("Program	13 :: LISTING 4.13 GuessNumberUsingBreak.java\n");
			System.out.println("Program	14 :: LISTING 4.14 PrimeNumber.java\n");
			System.out.println("Program	15 :: LISTING 4.15 SentinelValueUsingConfirmationDialog.java\n");


			System.out.println("_____________________________________________________________________\n");
				System.out.println("Enter number for Listing :: 0 for Part 1_Chapter List");
				inputValue = src.nextInt();

						switch (inputValue){
							case 1:
								int number = (int)(Math.random() *101);
								System.out.println("Guess a magic number between 0 and 100");
								//Prompt the user to guess the number
								System.out.println("\nEnter your guess: ");
								int guess = src.nextInt();
								if (guess == number)
								System.out.println("Yes, the number is " + number);
								else if (guess>number)
								System.out.println("Your guess is too high");
								else
								System.out.println("Your guess is too low");

						break;
							case 2:
								int number1 = (int)(Math.random() *101);
								System.out.println("Guess a magic number between 0 and 100");
								int guess1 =-1;
							while (guess1!=number1){
								//prompt the user to guess the number
								System.out.println("\nEnter your guess: ");
								guess1=src.nextInt();

								if (guess1 == number1)
								System.out.println("Yes, the number is "+ number1);
								else if (guess1>number1)
								System.out.println("Your guess is too high");
								else
								System.out.println("Your guess is too low");
							}

						break;
							case 3:
								final int NUMBER_OF_QUESTIONS = 5; // Number of questions
								int correctCount = 0; // Count the number of correct answers
								int count = 0; // Count the number of questions
								long startTime = System.currentTimeMillis();
								String output = ""; // output string is initially empty
								Scanner input = new Scanner(System.in);
								while (count < NUMBER_OF_QUESTIONS) {
								// 1. Generate two random single-digit integers
								int number2 = (int)(Math.random() * 10);
								int number3 = (int)(Math.random() * 10);
								// 2. If number2 < number3, swap number1 with number2
								if (number2 < number3) {
								int temp = number2;
								number2 = number3;
								number3 = temp;
								}

								// 3. Prompt the student to answer "What is number1 – number2?"
								System.out.print(
								"What is " + number2 + " - " + number3 + "? ");
								int answer = input.nextInt();

								// 4. Grade the answer and display the result
								if (number2 - number3 == answer) {
								System.out.println("You are correct!");
								correctCount++;
								}
								else
								System.out.println("Your answer is wrong.\n" + number2 + " - " + number3 + " should be " + (number2 - number3));
								// Increase the count
								count++;
								output += "\n" + number2 + "-" + number3 + "=" + answer + ((number2 - number3 == answer) ? " correct" : " wrong");
								}
								long endTime = System.currentTimeMillis();
								long testTime = endTime - startTime;
								System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);

						break;
							case 4:
							//-----------------LISTING 4.4 SentinelValue.java>>>>>>>>>

								// Read an initial data
								System.out.print( "Enter an int value (the program exits if the input is 0): ");
								int data = src.nextInt();

								// Keep reading data until the input is 0
								int sum = 0;
							while (data != 0) {
								sum += data;

								// Read the next data
								System.out.print(
								"Enter an int value (the program exits if the input is 0): ");
								data = src.nextInt();
								System.out.println("The sum is " + sum);
							}
						break;
							case 5:	//LISTING 4.5 TestDoWhile.java >>>>>
								int data1;
								int sum1 = 0;

								// Keep reading data until the input is 0
								do{
								// Read the next data
								System.out.print( "Enter an int value (the program exits if the input is 0): ");
								data1 = src.nextInt();

								sum1 += data1;
								} while (data1 != 0);
								System.out.println("The sum is " + sum1);
						break;
							case 6:	// LISTING 4.6 MultiplicationTable.java >>>
								// Display the table heading
								System.out.println(" Multiplication Table");
								// Display the number title
								System.out.print("    ");
							for (int j = 1; j <= 9; j++)
								System.out.print("   " + j);

								System.out.println("\n----------------------------------------");

								// Print table body
							for (int i = 1; i <= 9; i++) {
								System.out.print(i + " | ");
							for (int j = 1; j <= 9; j++) {
								// Display the product and align properly
								System.out.printf("%4d", i * j);
							}
								System.out.println();
							}

						break;
							case 7:	// LISTING 4.7 TestSum.java >>>
							// Initialize sum
							float sum2 = 0;
							// Add 0.01, 0.02, ..., 0.99, 1 to sum
							for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
							sum2 += i;
							// Display result
							System.out.println("The sum is " + sum2);

					break;
						case 8:// LISTING 4.8 GreatestCommonDivisor.java >>>
							// Prompt the user to enter two integers
							System.out.print("Enter first integer: ");
							int n1 = src.nextInt();
							System.out.print("Enter second integer: ");
							int n2 = src.nextInt();
							int gcd = 1;// Initial gcd is 1
							int k = 2; // Possible gcd
						while (k <= n1 && k <= n2) {
							if (n1 % k == 0 && n2 % k == 0)
							gcd = k; // Update gcd
							k++;
						}
						System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);

					break;
						case 9:
							double tuition = 10000; // Year 1
							int year = 1;
							while (tuition < 20000) {
							tuition = tuition * 1.07;
							year++;
							}
							System.out.println("Tuition will be doubled in " + year + " years");

					break;
						case 10: //* LISTING 4.10 MonteCarloSimulation.java *\
							final int NUMBER_OF_TRIALS = 10000000;
							int numberOfHits = 0;
						for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
							double x = Math.random() * 2.0 - 1;
							double y = Math.random() * 2.0 - 1;
							if (x * x + y * y <= 1)
							numberOfHits++;
						}
							double pi = 4.0 * numberOfHits / NUMBER_OF_TRIALS;
							System.out.println("PI is " + pi);
					break;

						case 11:
							int sum3 = 0;
							int number4 = 0;
						while (number4 < 20) {
							number4++;
							sum3+= number4;
							if (sum3 >= 100)
							break;
						}
							System.out.println("The number is " + number4);
							System.out.println("The sum is " + sum3);
					break;
						case 12:
						//*LISTING 4.12 TestContinue.java*\
							int sum4 = 0;
							int number5 = 0;

							while (number5 < 20) {
							number5++;
							if (number5 == 10 || number5 == 11)
							continue;
							sum4 += number5;
							}
							System.out.println("The sum is " + sum4);
					break;

						case 13: //*LISTING 4.13 GuessNumberUsingBreak.java*\
							// Generate a random number to be guessed
							int number6 = (int)(Math.random() * 101);
							System.out.println("Guess a magic number between 0 and 100");
						while (true){
							// Prompt the user to guess the number
							System.out.print("\nEnter your guess: ");
							int guess2 = src.nextInt();
							if (guess2 == number6) {
							System.out.println("Yes, the number is " + number6);
							break;
							}
							else if (guess2 > number6)
							System.out.println("Your guess is too high");
							else
							System.out.println("Your guess is too low");
						} // End of loop
					break;
						case 14: //LISTING 4.14 PrimeNumber.java*\
							final int NUMBER_OF_PRIMES = 50; // Number of primes to display
							final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
							int count3 = 0; // Count the number of prime numbers
							int number8 = 2; // A number to be tested for primeness
							System.out.println("The first 50 prime numbers are \n");

							// Repeatedly find prime numbers
						while (count3 < NUMBER_OF_PRIMES) {
							// Assume the number is prime
							boolean isPrime = true; // Is the current number prime?

							// Test whether number is prime
						for (int divisor = 2; divisor <= number8 / 2; divisor++) {
							if (number8 % divisor == 0) { // If true, number is not prime
							isPrime = false; // Set isPrime to false
							break; // Exit the for loop
							}
						}

							// Print the prime number and increase the count
							if (isPrime) {
							count3++; // Increase the count
							if (count3 % NUMBER_OF_PRIMES_PER_LINE == 0) {
							// Print the number and advance to the new line
							System.out.println(number8);
							}
							else
							System.out.print(number8 + " ");
							}
							// Check if the next number is prime
							number8++;
						}
					break;
						case 15://LISTING 4.15 SentinelValueUsingConfirmationDialog.java >>>

							int sum5 = 0;
							// Keep reading data until the user answers No
							int option = JOptionPane.YES_OPTION;
						while (option == JOptionPane.YES_OPTION) { // Read the next data
							String dataString = JOptionPane.showInputDialog( "Enter an int value: ");
							int data5 = Integer.parseInt(dataString);
							sum5 += data5;
							option = JOptionPane.showConfirmDialog(null, "Continue?");
						}
							JOptionPane.showMessageDialog(null, "The sum is " + sum5);

					break;






			}//end switch : case >>


		}while (inputValue!=0);

	}


}