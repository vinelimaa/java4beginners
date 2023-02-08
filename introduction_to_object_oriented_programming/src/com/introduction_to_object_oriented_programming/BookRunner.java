package com.introduction_to_object_oriented_programming;

public class BookRunner {

	public static void main(String[] args) {

		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(100);
		Book cleanCode = new Book(100);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.setNoOfCopies(80);
		effectiveJava.setNoOfCopies(50);
		cleanCode.setNoOfCopies(45);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}

}
