package tips_and_tricks2;

import tips_and_tricks.ExampleClass;

public class MethodAccessRunnerInDifferentPackage {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
//		exampleClass.protectedMethod();
//		exampleClass.privateMethod();
//		exampleClass.defaultMethod();
	}

}
