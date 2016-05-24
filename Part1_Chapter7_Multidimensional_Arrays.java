import java.util.Scanner;
public class Part1_Chapter7_Multidimensional_Arrays{
	static Scanner src= new Scanner(System.in);
public void Part1_Chapter7_Multidimensional_Arrays_Display(){


	int inputValue;
	do {


			System.out.println("\n_____________________________________________________________________");
			System.out.println(">>> Part 1 :: Chapter 7 # Multidimensional_Arrays # (ProgramList) <<<");
			System.out.println("=====================================================================\n");

			System.out.println("Program 1 :: LISTING 7.1 PassTwoDimensionalArray.java\n");
			System.out.println("Program 2 :: LISTING 7.2 GradeExam.java \n");
			System.out.println("Program 3 :: LISTING 7.3 FindNearestPoints.java\n");
			System.out.println("Program 4 :: LISTING 7.4 CheckSudokuSolution.java\n");
			System.out.println("Program 5 :: LISTING 7.5 Weather.java\n");
			System.out.println("Program	6 :: LISTING 7.6 GuessBirthdayUsingArray.java\n");

			System.out.println("_____________________________________________________________________\n");
				System.out.println("Enter number for Listing :: 0 for Part 1_Chapter List");
				inputValue = src.nextInt();

						switch (inputValue){
							case 1:
							// Enter array values
							int[][] m = new int[3][4];
							System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
							for (int i = 0; i < m.length; i++)
							for (int j = 0; j < m[i].length; j++)
							m[i][j] = src.nextInt();

							// Display result
							System.out.println("\nSum of all elements is " + sum(m) );

						break;
							case 2:
							char[][] answers = {
								{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
								{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
								{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
								{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
								{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
								{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
								{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
								{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

										// Key to the questions
										char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
										// Grade all answers
									for (int i = 0;i < answers.length ; i++) {
										// Grade one student
										int correctCount = 0;
									for (int j = 0;j < answers[i].length ; j++) {
										if(answers[i][j] == keys[j] )
										correctCount++;
									}

										System.out.println("Student " + i + "'s correct count is " +
										correctCount);
									}


						break;
							case 3:

							System.out.print("Enter the number of points: ");
							int numberOfPoints = src.nextInt();
							// Create an array to store points
							double[][] points = new double[numberOfPoints][2];
							System.out.print("Enter " + numberOfPoints + " points: ");
						for (int i = 0; i < points.length; i++) {
							points[i][0] = src.nextDouble();
							points[i][1] = src.nextDouble();
						}

							// p1 and p2 are the indices in the points array
							int p1 = 0, p2 = 1; // Initial two points
							double shortestDistance = distance(points[p1][0], points[p1][1],
							points[p2][0], points[p2][1]); // Initialize shortestDistance

							// Compute distance for every two points
						for (int i = 0; i < points.length; i++) {
						for (int j = i + 1; j < points.length; j++) {
							double distance = distance(points[i][0], points[i][1],
							points[j][0], points[j][1]); // Find distance

							if (shortestDistance > distance) {
							p1 = i; // Update p1
							p2 = j; // Update p2
							shortestDistance = distance; // Update shortestDistance
						}
						}
					}
					// Display result
							System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + ") and (" +  points[p2][0] + ", " + points[p2][1] + ")");
						break;
							case 4:
							// Read a Stock solution
							 int[][] grid = readASolution();
							 System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
						break;
							case 5:

								 final int NUMBER_OF_DAYS = 10;
								 final int NUMBER_OF_HOURS = 24;
							double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];


								 // Read input using input redirection from a file
							for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
								 int day = src.nextInt();
								 int hour = src.nextInt();
								 double temperature = src.nextDouble();
								 double humidity = src.nextDouble();
								 data[day - 1][hour - 1][0] = temperature;
								 data[day - 1][hour - 1][1] = humidity;
							 }

								// Find the average daily temperature and humidity
							for (int i = 0; i < NUMBER_OF_DAYS; i++) {
								 double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
							for (int j = 0; j < NUMBER_OF_HOURS; j++) {
								 dailyTemperatureTotal += data[i][j][0];
							 	 dailyHumidityTotal += data[i][j][1];
							}

								 // Display result
								 System.out.println("Day " + i + "'s average temperature is "+ dailyTemperatureTotal / NUMBER_OF_HOURS);
								 System.out.println("Day " + i + "'s average humidity is " + dailyHumidityTotal / NUMBER_OF_HOURS);
								 }
						break;
							case 6:

							int day = 0; // Day to be determined
							int answer;

							int[][][] dates = {
							{{ 1, 3, 5, 7},
							{ 9, 11, 13, 15},
							{17, 19, 21, 23},
							{25, 27, 29, 31}},
							{{ 2, 3, 6, 7},
							{10, 11, 14, 15},
							{18, 19, 22, 23},
							{26, 27, 30, 31}},
							{{ 4, 5, 6, 7},
							{12, 13, 14, 15},
							{20, 21, 22, 23},
							{28, 29, 30, 31}},
							{{ 8, 9, 10, 11},
							{12, 13, 14, 15},
							{24, 25, 26, 27},
							{28, 29, 30, 31}},
							{{16, 17, 18, 19},
							{20, 21, 22, 23},
							{24, 25, 26, 27},
							{28, 29, 30, 31}}};


						for (int i = 0; i < 5; i++) {
							System.out.println("Is your birthday in Set" + (i + 1) + "?");
						for (int j = 0; j < 4; j++) {
						for (int k = 0; k < 4; k++)
							System.out.printf("%4d",dates[i][j][k] );
							System.out.println();
						}

							System.out.print("\nEnter 0 for No and 1 for Yes: ");
							answer = src.nextInt();

							if (answer == 1)
							day += dates[i][0][0] ;
						}
							System.out.println("Your birth day is " + day);

						break;
					}//end switch : case >>


		}while (inputValue!=0);

	}//end display method...

						//---------------------case 1 method ................>>
							public static int sum(int[][] m) {
								int total = 0;
								for (int row = 0; row < m.length; row++) {
								for (int column = 0; column < m[row].length; column++) {
								total += m[row][column];
								}
								}

								return total;
							}

							// ----------------case 2 method ...................>>>
							/** Compute the distance between two points (x1, y1) and (x2, y2)*/
								public static double distance(
									double x1, double y1, double x2, double y2) {
									return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
								}


								// ------------- case 4 method ---------->>

								/** Read a Stock solution from the console */
							public static int[][] readASolution() {

								 System.out.println("Enter a Sudoku puzzle solution:");
								 int[][] grid = new int[9][9];

								for (int i = 0; i < 9; i++)
								 for (int j = 0; j < 9; j++)
								 grid[i][j] = src.nextInt();

								 return grid;
							 }

								 /** Check whether a solution is valid */
							public static boolean isValid(int[][] grid) {
								 // Check whether each row has numbers 1 to 9
								 for (int i = 0; i < 9; i++)
								 if(!is1To9(grid[i]) ) // If grid[i] does not contain 1 to 9
								 return false;

								 // Check whether each column has numbers 1 to 9
							for (int j = 0; j < 9; j++) {
								 // Obtain a column in the one-dimensional array
								 int[] column = new int[9];
							for (int i = 0; i < 9; i++) {
								 column[i] = grid[i][j];
							}

								 if(!is1To9(column) ) // If column does not contain 1 to 9
								 return false;
							}

								 // Check whether each 3-by-3 box has numbers 1 to 9
							for (int i = 0; i < 3; i++) {
							for (int j = 0; j < 3; j++) {
								 // The starting element in a small 3-by-3 box
								 int k = 0;
								 int[] list = new int[9]; // Get all numbers in the box to list
								 for (int row = i * 3; row < i * 3 + 3; row ++)
								 for (int column = j * 3; column < j * 3 + 3; column++)
								 list[k++] = grid[row][column];

								 if(!is1To9(list) ) // If list does not contain 1 to 9
								 return false;
							}
							}

								 return true; // The fixed cells are valid
							}

								 /** Check whether the one-dimensional array contains 1 to 9 */
							public static boolean is1To9(int[] list) {
								 // Make a copy of the array
								 int[] temp = new int[list.length];
								 System.arraycopy(list, 0, temp, 0, list.length);

								 // Sort the array
								 java.util.Arrays.sort(temp);

								 // Check whether the list contains 1, 2, 3, ..., 9
								 for (int i = 0; i < 9; i++)
									 if (temp[i] != i+1)
								return false;

								 return true; // The list contains exactly 1 to 9
							}



}//end Class...