import javax.swing.JOptionPane;
import java.util.Scanner;
public class Part1_Chapter5_Method{
public void Part1_Chapter5_Display(){
Scanner src= new Scanner(System.in);

	int inputValue;
	do {


			System.out.println("___________________________________________________________________");
			System.out.println("______>>>> Part 1 :: Chapter 5 # Method # (ProgramList) <<<<_______");
			System.out.println("===================================================================\n");

			//part 1 :: Chapter 2
			System.out.println("Program 1 :: LISTING 5.1 TestMax.java\n");
			System.out.println("Program 2 :: LISTING 5.2 TestVoidMethod.java \n");
			System.out.println("Program 3 :: LISTING 5.3 TestReturnGradeMethod.java\n");
			System.out.println("Program 4 :: LISTING 5.4 Increment.java\n");
			System.out.println("Program 5 :: LISTING 5.5 TestPassByValue.java\n");
			System.out.println("Program	6 :: LISTING 5.6 GreatestCommonDivisorMethod.java\n");
			System.out.println("Program	7 :: LISTING 5.7 PrimeNumberMethod.java \n");
			System.out.println("Program	8 :: LISTING 5.8 Decimal2HexConversion.java\n");
			System.out.println("Program	9 :: LISTING 5.9 TestMethodOverloading.java\n");
			System.out.println("Program	10 :: LISTING 5.10/11 Test/RandomCharacter.java\n");
			System.out.println("Program	11 :: LISTING 5.12 PrintCalendar.java\n");


			System.out.println("_____________________________________________________________________\n");
				System.out.println("Enter number for Listing :: 0 for Part 1_Chapter List");
				inputValue = src.nextInt();

						switch (inputValue){
							case 1:
								int i = 5;
								int j = 2;
								int k = max (i, j) ;
								System.out.println("The maximum between " + i + " and " + j + " is " + k);
								// max method declare ....end
						break;
							case 2:
							System.out.print("The grade is ");
							printGrade(78.5);
							System.out.print("The grade is ");
							printGrade(59.5);


						break;
							case 3:
							//LISTING 5.3 TestReturnGradeMethod.java
							System.out.print("The grade is "+ getGrade(78.5));
							System.out.print("\nThe grade is " + getGrade(59.5));
						break;
							case 4:
							//LISTING 5.4 Increment.java
							int x = 1;
							System.out.println("Before the call, x is " + x);
							increment(x);
							System.out.println("after the call, x is " + x);
						break;
							case 5:
							//LISTING 5.5 TestPassByValue.java
							// Declare and initialize variables
							int num1 = 1;
							int num2 = 2;

							System.out.println("Before invoking the swap method, num1 is " +
							num1 + " and num2 is " + num2);

							// Invoke the swap method to attempt to swap two variables
							swap(num1, num2);
							System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
						break;
							case 6:
								// Prompt the user to enter two integers
								System.out.print("Enter first integer: ");
								int n1 = src.nextInt();
								System.out.print("Enter second integer: ");
								int n2 = src.nextInt();

								System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " +gcd(n1, n2));
						break;
							case 7:
							//LISTING 5.7 PrimeNumberMethod.java
							System.out.println("The first 50 prime numbers are \n");
							printPrimeNumbers(50);
						break;
							case 8:
								//LISTING 5.8 Decimal2HexConversion.java
								// Prompt the user to enter a decimal integer
								System.out.print("Enter a decimal number: ");
								int decimal = src.nextInt();
								System.out.println("The hex number for decimal " + decimal + " is " + decimalToHex(decimal));

						break;
							case 9:
							// LISTING 5.9 TestMethodOverloading.java
								// Invoke the max method with int parameters
								System.out.println("The maximum between 3 and 4 is "+max3(3, 4) );

								 // Invoke the max method with the double parameters
								System.out.println("The maximum between 3.0 and 5.4 is "+ max3(3.0, 5.4));

								 // Invoke the max method with three double parameters
								System.out.println("The maximum between 3.0, 5.4, and 10.14 is " + max3(3.0, 5.4, 10.14));

						break;
							case 10:
							//LISTING 5.10 RandomCharacter.java
							final int NUMBER_OF_CHARS = 175;
							final int CHARS_PER_LINE = 25;

							// Print random characters between 'a' and 'z', 25 chars per line
						for (int k1 = 0; k1 < NUMBER_OF_CHARS; k1++) {
							char ch = RandomCharacter.getRandomLowerCaseLetter();
							if ((k1 + 1) % CHARS_PER_LINE == 0)
							System.out.println(ch);
							else
							System.out.print(ch);
						}

						break;
							case 11:
							// Prompt the user to enter year
							System.out.print("Enter full year (e.g., 2001): ");
							int year = src.nextInt();

							 // Prompt the user to enter month
							 System.out.print("Enter month in number between 1 and 12: ");
							 int month = src.nextInt();

							// Print calendar for the month of the year
							printMonth(year, month);

						break;


						}//end switch : case >>


		}while (inputValue!=0);

	}//end display method...

					// case 1 method declare ....
						private int max(int num1, int num2){
							int result;
							if (num1 > num2)
							result = num1;
							else
							result = num2;

							return result;

						}
					// case 2 method declare ....
						public static void printGrade(double score) {
							if (score >= 90.0) {
							System.out.println('A');
							}
							else if (score >= 80.0) {
							System.out.println('B');
							}
							else if (score >= 70.0) {
							System.out.println('C');
							}
							else if (score >= 60.0) {
							System.out.println('D');
							}
							else {
							System.out.println('F');
							}
						}
					// case 3 method declare ----
						public static char getGrade(double score) {
							if (score >= 90.0)
							return 'A';
							else if (score >= 80.0)
							return 'B';
							else if (score >= 70.0)
							return 'C';
							else if (score >= 60.0)
							return 'D';
							else
							return 'F';
					}
					//case 4 method declare...
						public static void increment(int n) {
							n++;
							System.out.println("n inside the method is " + n);
						}
					// case 5 method declare...
						/** Swap two variables */
						public static void swap(int n1, int n2){
							System.out.println("\tInside the swap method");
							System.out.println("\t\tBefore swapping n1 is " + n1 + " n2 is " + n2);
							// Swap n1 with n2
							int temp = n1;
							n1 = n2;
							n2 = temp;
							System.out.println("\t\tAfter swapping n1 is " + n1  + " n2 is " + n2);
					   }

				//case 6 method declare
						/** Return the gcd of two integers */
						public static int gcd(int n1, int n2){
							int gcd = 1; // Initial gcd is 1
							int k = 2; // Possible gcd
							while (k <= n1 && k <= n2) {
							if (n1 % k == 0 && n2 % k == 0)
							gcd = k; // Update gcd
							k++;
							}
							return gcd;  // Return gcd
						}
				//case 7 method declare...

					public static void printPrimeNumbers(int numberOfPrimes) {
						final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
						int count = 0; // Count the number of prime numbers
						int number = 2; // A number to be tested for primeness

						// Repeatedly find prime numbers
					while (count < numberOfPrimes) {
						// Print the prime number and increase the count
						if( isPrime(number)) {
						count++; // Increase the count

						if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
						// Print the number and advance to the new line
						System.out.printf("%-5s\n", number);
						}
						else
						System.out.printf("%-5s", number);
						}

						// Check whether the next number is prime
						number++;
					}
				}

						/** Check whether number is prime */
					public static boolean isPrime(int number) {

						for (int divisor = 2; divisor <= number / 2; divisor++) {
						if (number % divisor == 0) { // If true, number is not prime
						return false; // number is not a prime
						}
						}

						return true; // number is prime
					}



				// Case 8 method declare...
						/** Convert a decimal to a hex as a string */
					public static String decimalToHex(int decimal) {
						String hex = "";
						while (decimal != 0) {
						int hexValue = decimal % 16;
						hex = toHexChar(hexValue)+ hex;
						decimal = decimal / 16;
						}
						return hex;
					}
						/** Convert an integer to a single hex digit in a character */
					public static char toHexChar(int hexValue) {
						if (hexValue <= 9 && hexValue >= 0)
						return(char)(hexValue + '0') ;
						else // hexValue <= 15 && hexValue >= 10
						return (char)(hexValue - 10 + 'A');
					}


					//case 9 method declare
					/** Return the max between two int values */
					public static int max3(int num1, int num2){
						if (num1 > num2)
						return num1;
						else
						return num2;
					}

					/** Find the max between two double values */
					public static double max3(double num1, double num2){
						if (num1 > num2)
						return num1;
						else
						return num2;
					}

					/** Return the max among three double values */
					public static double max3(double num1, double num2, double num3){
					return max3(max3(num1, num2), num3);
					}



						//case 11
						/** Print the calendar for a month in a year */
					public static void printMonth(int year, int month){
						// Print the headings of the calendar
						printMonthTitle(year, month);
						// Print the body of the calendar
						printMonthBody(year, month);
					}
						/** Print the month title, e.g., May, 1999 */
					public static void printMonthTitle(int year, int month){
						System.out.println(" " + getMonthName(month) + " " + year);
						System.out.println("-------------------------------------------");
						System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
					}
						/** Get the English name for the month */
					public static String getMonthName(int month){
						String monthName = " ";
						switch (month) {
						case 1: monthName = "January"; break;
						case 2: monthName = "February"; break;
						case 3: monthName = "March"; break;
						case 4: monthName = "April"; break;
						case 5: monthName = "May"; break;
						case 6: monthName = "June"; break;
						case 7: monthName = "July"; break;
						case 8: monthName = "August"; break;
						case 9: monthName = "September"; break;
						case 10: monthName = "October"; break;
						case 11: monthName = "November"; break;
						case 12: monthName = "December";
						}
						return monthName;
					}

						/** Print month body */
					public static void printMonthBody(int year, int month){
						// Get start day of the week for the first date in the month
						int startDay =getStartDay(year, month);
						// Get number of days in the month
						int numberOfDaysInMonth =getNumberOfDaysInMonth(year, month);
						// Pad space before the first day of the month
						int i = 0;
						for (i = 0; i < startDay; i++)
						System.out.print(" ");

						for (i = 1; i <= numberOfDaysInMonth; i++) {
						System.out.printf("%4d", i);

						if ((i + startDay) % 7 == 0)
						System.out.println();
						}

						System.out.println();
					}

						/** Get the start day of month/1/year */
					public static int getStartDay(int year, int month) {
						final int START_DAY_FOR_JAN_1_1800 = 3;
						// Get total number of days from 1/1/1800 to month/1/year
						int totalNumberOfDays = getTotalNumberOfDays(year, month);

						// Return the start day for month/1/year
						return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
					}

						/** Get the total number of days since January 1, 1800 */
					public static int getTotalNumberOfDays(int year, int month){
						int total = 0;

						// Get the total days from 1800 to 1/1/year
						for (int i = 1800; i < year; i++)
						if (isLeapYear(i))
						total = total + 366;
						else
						total = total + 365;
						// Add days from Jan to the month prior to the calendar month
						for (int i = 1; i < month; i++)
						total = total + getNumberOfDaysInMonth(year, i);

						return total;
					}

						/** Get the number of days in a month */
					public static int getNumberOfDaysInMonth(int year, int month){
						if (month == 1 || month == 3 || month == 5 || month == 7 ||
						month == 8 || month == 10 || month == 12)
						return 31;

						if (month == 4 || month == 6 || month == 9 || month == 11)
						return 30;

						if (month == 2) return isLeapYear(year) ? 29 : 28;

						return 0; // If month is incorrect
						}

						/** Determine if it is a leap year */
						public static boolean isLeapYear(int year){
						return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
					}

}//end Class...