import javax.swing.JOptionPane;
import java.util.Scanner;
public class Part1Chapter2{
public void Part1Chapter2Display(){
Scanner src= new Scanner(System.in);

	int inputValue;
	do {


			System.out.println("___________________________________________________________________");
			System.out.println("_________>>>>>>> Part 1 :: Chapter 2 (ProgramList) <<<<<<<_________");
			System.out.println("===================================================================\n");

			//part 1 :: Chapter 2
			System.out.println("Program 1 :: LISTING 2.1 ComputeArea.java\n");
			System.out.println("Program 2 :: LISTING 2.2 ComputeAreaWithConsoleInput.java \n");
			System.out.println("Program 3 :: LISTING 2.3 ComputeAverage.java \n");
			System.out.println("Program 4 :: LISTING 2.4 DisplayTime.java\n");
			System.out.println("Program 5 :: LISTING 2.5 FahrenheitToCelsius.java \n");
			System.out.println("Program	6 :: LISTING 2.6 ShowCurrentTime.java\n");
			System.out.println("Program	7 :: LISTING 2.7 SalesTax.java\n");
			System.out.println("Program	8 :: LISTING 2.8 ComputeLoan.java\n");
			System.out.println("Program	9 :: LISTING 2.9 DisplayUnicode.java\n");
			System.out.println("Program	10 :: LISTING 2.10 ComputeChange.java\n");
			System.out.println("Program	11 :: LISTING 2.11 ComputeLoanUsingInputDialog.java\n");


			System.out.println("_____________________________________________________________________\n");
				System.out.println("Enter number for Listing :: 0 for Part 1_Chapter List");
				inputValue = src.nextInt();

						switch (inputValue){
							case 1:
								double radius; // Declare radius
								double area; // Declare area
								// Assign a radius
								radius = 20; // New value is radius
								// Compute area
								area = radius * radius * 3.14159;
								// Display results
								System.out.println("The area for the circle of radius " + radius + " is " + area);

						break;
							case 2:
								// Already Create a Scanner object
								System.out.print("Enter a number for radius: ");
								double radius1 =src.nextDouble();
								// Compute area
								double area1 = (radius1 * radius1 * 3.14159);
								// Display result
								System.out.println("The area for the circle of radius " + radius1 + " is " + area1);

						break;
							case 3:
								System.out.print("Enter three numbers: ");
								double number1=src.nextDouble();
								double number2=src.nextDouble();
								double number3=src.nextDouble();
								// Compute average
								 double average = (number1 + number2 + number3) / 3;

								// Display result
								System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);

						break;
							case 4:
								//Display Time
								System.out.print("Enter an integer for seconds: ");
								int seconds =src.nextInt();
								int minutes = seconds /60; // Find minutes in seconds
								int remainingSeconds =seconds %60; ; // Seconds remaining
								System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
						break;
							case 5:
								//FahrenheitToCelsius
								System.out.print("Enter a degree in Fahrenheit: ");
								double fahrenheit = src.nextDouble();
								// Convert Fahrenheit to Celsius
								double celsius =(5.0/9) * (fahrenheit - 32);
								System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
						break;
							case 6:
								// Obtain the total milliseconds since midnight, Jan 1, 1970
								long totalMilliseconds = System.currentTimeMillis();
								// Obtain the total seconds since midnight, Jan 1, 1970
								long totalSeconds = totalMilliseconds / 1000;
								// Compute the current second in the minute in the hour
								long currentSecond = (int)(totalSeconds % 60);
								// Obtain the total minutes
								long totalMinutes = totalSeconds / 60;
								// Compute the current minute in the hour
								long currentMinute = totalMinutes % 60;
								// Obtain the total hours
								long totalHours = totalMinutes / 60;
								// Compute the current hour
								long currentHour = totalHours % 24;
								// Display results
								System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
						break;
							case 7:
								System.out.print("Enter purchase amount: ");
								double purchaseAmount = src.nextDouble();
								double tax = purchaseAmount * 0.06;
								System.out.println("Sales tax is " + (int)(tax*100)/100.0) ;
						break;
							case 8:
								// Enter yearly interest rate
								System.out.print("Enter yearly interest rate, for example 8.25: ");
								double annualInterestRate = src.nextDouble();
								// Obtain monthly interest rate
								double monthlyInterestRate = annualInterestRate / 1200;
								// Enter number of years
								System.out.print("Enter number of years as an integer, for example 5: ");
								int numberOfYears = src.nextInt();
								// Enter loan amount
								System.out.print("Enter loan amount, for example 120000.95: ");
								double loanAmount = src.nextDouble();
								// Calculate payment
								double monthlyPayment= loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
								double totalPayment= monthlyPayment * numberOfYears * 12;

								// Display results
								System.out.println("The monthly payment is " +	(int)(monthlyPayment * 100) / 100.0);
								System.out.println("The total payment is " +(int)(totalPayment * 100) / 100.0);

						break;
							case 9:
								JOptionPane.showMessageDialog(null,"\u6B22\u8FCE \u03b1 \u03b2 \u03b3","\u6B22\u8FCE Welcome",JOptionPane.INFORMATION_MESSAGE);
					break;
						case 10:
								System.out.print("Enter an amount in double, for example 11.56: ");
								double amount = src.nextDouble();
								int remainingAmount = (int)(amount * 100);
								// Find the number of one dollars
								int numberOfOneDollars = remainingAmount / 100;
								remainingAmount = remainingAmount % 100;
								// Find the number of quarters in the remaining amount
								int numberOfQuarters = remainingAmount / 25;
								remainingAmount = remainingAmount % 25;
								// Find the number of dimes in the remaining amount
								int numberOfDimes = remainingAmount / 10;
								remainingAmount = remainingAmount % 10;
								// Find the number of nickels in the remaining amount
								int numberOfNickels = remainingAmount / 5;
								remainingAmount = remainingAmount % 5;
								// Find the number of pennies in the remaining amount
								int numberOfPennies = remainingAmount;
								// Display results
								System.out.println("Your amount " + amount + " consists of \n" +
								"\t" + numberOfOneDollars + " dollars\n" +
								"\t" + numberOfQuarters + " quarters\n" +
								"\t" + numberOfDimes + " dimes\n" +
								"\t" + numberOfNickels + " nickels\n" +
								"\t" + numberOfPennies + " pennies");
					break;
						case 11:
			// Enter yearly interest rate
			String annualInterestRateString = JOptionPane.showInputDialog("Enter yearly interest rate, for example 8.25:");

			// Convert string to double
			double annualInterestRate1 = Double.parseDouble(annualInterestRateString);

			// Obtain monthly interest rate
			double monthlyInterestRate1 = annualInterestRate1 / 1200;
			// Enter number of years
			String numberOfYearsString = JOptionPane.showInputDialog("Enter number of years as an integer, \nfor example 5:");

			// Convert string to int
			int numberOfYears1 = Integer.parseInt(numberOfYearsString);

			// Enter loan amount
			String loanString = JOptionPane.showInputDialog("Enter loan amount, for example 120000.95:");

			// Convert string to double
			double loanAmount1 = Double.parseDouble(loanString);

			// Calculate payment
			double monthlyPayment1= loanAmount1 * monthlyInterestRate1 / (1 - 1 / Math.pow(1 + monthlyInterestRate1, numberOfYears1 * 12));
			double totalPayment1= monthlyPayment1 * numberOfYears1 * 12;

			// Format to keep two digits after the decimal point
			monthlyPayment1 = (int)(monthlyPayment1 * 100) / 100.0;
			totalPayment1 = (int)(totalPayment1 * 100) / 100.0;
			// Display results
			String output="The mnthly Payment is"+ monthlyPayment1 + "\nThe total payment is " + totalPayment1;
			JOptionPane.showMessageDialog(null,output );


					break;


			}
		}while (inputValue!=0);

	}


}