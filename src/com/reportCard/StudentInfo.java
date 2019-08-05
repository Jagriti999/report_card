package com.reportCard;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] a) {

		String subject1 = "English";
		String subject2 = "Maths";
		String subject3 = "Science";

		for (int counter = 0; counter < 2; counter++) {
			Scanner scanner = new Scanner(System.in);

			String studentName = null;

			System.out.print("Enter the name of the student: ");
			studentName = scanner.nextLine();

			System.out.print("Enter the marks in " + subject1 + ": ");
			float marksInEnglish = scanner.nextFloat();
			System.out.print("Enter the marks in " + subject2 + ": ");
			float marksInMaths = scanner.nextFloat();
			System.out.print("Enter the marks in " + subject3 + ": ");
			float marksInScience = scanner.nextFloat();
			String gradesInEnglish = calculateGrade(marksInEnglish);
			String gradesInMaths = calculateGrade(marksInMaths);
			String gradesInScience = calculateGrade(marksInScience);
			float totalMarks = marksInEnglish + marksInMaths + marksInScience;
			String totalGrade = null;
			if (gradesInEnglish.equals("F") || gradesInMaths.equals("F") || gradesInScience.equals("F"))
				totalGrade = "F";
			else {
				float percentage = (totalMarks / 300) * 100;
				totalGrade = calculateGrade(percentage);
			}

			System.out.println(studentName + ": ");
			System.out.println("Subject     Marks     Grade");
			System.out.println(subject1 + "     " + marksInEnglish + "        " + gradesInEnglish);
			System.out.println(subject2 + "       " + marksInMaths + "        " + gradesInMaths);
			System.out.println(subject3 + "     " + marksInScience + "        " + gradesInScience);
			System.out.println("Total" + "       " + totalMarks + "       " + totalGrade);
			System.out.println(totalGrade.equals("F") ? "Fail" : "Pass");
			scanner.close();
		}
	}

	private static String calculateGrade(float marks) {

		if (marks > 90 && marks <= 100) {
			return "A+";
		} else if (marks > 80 && marks <= 89) {
			return "A";
		} else if (marks > 70 && marks <= 79) {
			return "B+";
		} else if (marks > 60 && marks <= 69) {
			return "B";
		} else if (marks > 50 && marks <= 59) {
			return "C+";
		} else if (marks > 40 && marks <= 49) {
			return "C";
		} else if (marks > 0 && marks <= 40) {
			return "F";
		} else
			return "";
	}
}
