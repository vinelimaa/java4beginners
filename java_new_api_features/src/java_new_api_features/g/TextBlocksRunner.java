package java_new_api_features.g;

public class TextBlocksRunner {

	public static void main(String[] args) {
		String str1 = """
				fddsfsdfsdf
				""";

		String str2 = """
				Line1
					Line2
							Line3
						Line4
					Line5
				Line6
				""";

		String str3 = """
				Line 1: %s
				Line 2: %s
				Line 3:
				Line 4:
				Line 5:
				Line 6:
				""".formatted("Some Value", "Other some value");

		System.out.println(str3);
	}
}
