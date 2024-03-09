package gradeStatistics;

// Importing required dependency for user input processing
import java.util.Scanner;

public class gradesStat {
	public static void main(String[] args) {
		// Declaring program variables and Scanner object for user input processing
		Scanner scanner = new Scanner(System.in);
		float grades = 0.0f;
		float gradeSum = 0.0f;
		float gradeCount = 0.0f;
		float maximumGrade = 0.0f;
		float minimumGrade = 100.0f;
		float averageGrade = 0.0f;
		
		//Display to the screen a welcome message and ask user for the number of grades being entered in the calculator
		System.out.println("Welcome to GradeCalc!");
		System.out.println("How many grades are you calculating statistics for?  ");
		gradeCount = scanner.nextFloat();
		System.out.println("Enter grade scores for students in the class: ");
		//Program main for-loop to request the user to input 10 grades
		for (int i = 0; i < gradeCount; i++) {
			grades = scanner.nextFloat();
			
			//if-else statements to check for maximum and minimum grades
			if (grades < 0 || grades > 100) {
				System.out.println("Please Enter a number between 0 and 100");
				grades = scanner.nextFloat();
			}
			
			if (grades > maximumGrade) {
				maximumGrade = grades;
			}
			
			if (grades < minimumGrade) {
				minimumGrade = grades;
			}
			
			//gradeSum variable sums all the grades entered and averageGrade divides gradeSum by the gradeCount variable
			gradeSum += grades;
			averageGrade = (gradeSum / gradeCount);
		}
		
		// Display grade statistics on the screen like the Average, Maximum, and Minimum grades.
		System.out.println("The Average Grade: " + averageGrade + '%');
		System.out.println("The Maximum Grade: " + maximumGrade + '%');
		System.out.println("The Minimum Grade: " + minimumGrade + '%');
	}

}
