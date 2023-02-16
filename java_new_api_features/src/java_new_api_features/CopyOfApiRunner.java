package java_new_api_features;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Vini");
		names.add("Bento");
		names.add("Kelly");

		doNotChange(names);
		System.out.println(names);
	}

	private static void doNotChange(List<String> names) {
		names.add("ShouldNotBeAllowed");

	}

}
