package exception_handling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {

		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);

		int[] numbers = { 1, 2, 3, 4, 5 };
		int number = numbers[4];
		System.out.println(number);

	} catch (Exception ex) {
		ex.printStackTrace();
	} finally {
		System.out.println("Before scanner close");
		if (scanner != null) {
			scanner.close();
		}
	}
	System.out.println("Just before closing out main");

	}

}
