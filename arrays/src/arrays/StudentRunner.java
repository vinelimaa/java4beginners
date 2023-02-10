package arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		Student student = new Student("Vinicius", 97, 98, 100);

		int number = student.getNumberOfMarks();
		System.out.println("Number of Marks: " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("Total Sum of Marks: " + sum);
		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum Mark: " + maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum Mark: " + minimumMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average: " + average);
		System.out.println(student);
		student.addnewMark(35);
		System.out.println(student);
		student.removemarkAtIndex(3);
		System.out.println(student);
	}

}
