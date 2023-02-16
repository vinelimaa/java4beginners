package tips_and_tricks;

import static java.lang.System.out;
import static java.util.Collections.*;

import java.util.ArrayList;
import java.util.Collections;

public class ImportsRunner {

	public static final void print(Object x) {
		System.out.println(x);
	}

	public static void main(String[] args) {

		System.out.println("imports");
		out.println("static imports");
		print("method for print");

		String str = "";
		
//		Collections.sort(new ArrayList<String>());
		sort(new ArrayList<String>());

	}

}
