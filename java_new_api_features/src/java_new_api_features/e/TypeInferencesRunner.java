package java_new_api_features.e;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {

		var names1 = List.of("Vinicius", "Kelly");
		var names2 = List.of("Nicollas", "Zilda");

		var var = "";

		final var names = List.of(names1, names2);

		names.stream().forEach(System.out::println);

		for (var name : names1) {
			System.out.println(name);
		}

		var filter = List.of("Vinicius", "Kelly", "Nicollas", "Bento").stream().filter(s -> s.length() > 5);
		filter.forEach(System.out::println);
	}

}
