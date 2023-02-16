package java_new_api_features.d;

class SampleClass {
	String str = null;
}

public class StringNewApiRunner {

	public static void main(String[] args) {

		System.out.println("".isBlank());
		System.out.println(" LR ".strip().replace(" ", "@"));
		System.out.println(" LR ".stripLeading().replace(" ", "@"));
		System.out.println(" LR ".stripTrailing().replace(" ", "@"));
		"Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);

		System.out.println("UPPER".transform(s -> s.substring(2)));
		System.out.println("My name is %s. My age is %d".formatted("Vini", 26));

//		String personalInfo = String.format("My name is %s. My age is %d", "Vini", 26);
//		System.out.println(personalInfo);

		SampleClass sample = new SampleClass();
		String str = null;
		System.out.println(sample.str.isBlank());

//		Exception in thread "main" java.lang.NullPointerException: 
//		Cannot invoke "String.isBlank()" because "sample.str" is null
//		at java_new_api_features.d.StringNewApiRunner.main(StringNewApiRunner.java:25)

//		Exception in thread "main" java.lang.NullPointerException: 
//		Cannot invoke "String.isBlank()" because "str" is null
//		at java_new_api_features.d.StringNewApiRunner.main(StringNewApiRunner.java:20)
	}
}
