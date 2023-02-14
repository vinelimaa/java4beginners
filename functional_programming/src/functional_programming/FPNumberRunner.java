package functional_programming;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPNumberRunner {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

		// Exercise - Print squares of first 10 numbers!
		// Clue - IntStream.range(1,10)

		IntStream.range(1, 11).forEach(e -> System.out.println(e));

		// List.of("Apple", "Ant", "Bat").stream()
		// Map all of these to lower case and print them

		List.of("Apple", "Ant", "Bat").stream().map(s -> s.toLowerCase()).forEach(e -> System.out.println(e));

		// List.of("Apple", "Ant", "Bat").stream()
		// Print the length of each element

		List.of("Apple", "Ant", "Bat").stream().forEach(e -> System.out.println(e.length()));

		numbers.stream().forEach(element -> System.out.println(element));

		int sum = numbers.stream().filter(element -> element % 2 != 0).reduce(0,
				(number1, number2) -> number1 + number2);
		System.out.println(sum);

		List<Integer> list3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int max = Collections.max(list3);
		int min = Collections.min(list3);

		System.out.println("soma: " + IntStream.range(min, max + 1).reduce(0, (n1, n2) -> n1 + n2));

		System.out.println(
				List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().max((n1, n2) -> Integer.compare(n1, n2)).get());

		System.out.println(
				List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().filter(e -> e % 2 != 0).collect(Collectors.toList()));

		System.out.println(IntStream.range(min, max + 1).map(e -> e * e).boxed().collect(Collectors.toList()));
	}

	private static void normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
	}

}
