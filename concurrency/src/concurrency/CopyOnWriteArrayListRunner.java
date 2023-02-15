package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//add - copy
//get

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {

		List<String> list = new CopyOnWriteArrayList<>();

		// Threads - 3
		list.add("Ant");
		list.add("bat");
		list.add("Cat");

		// Threads - 10000
		for (String element : list) {
			System.out.println(element);
		}
	}

}
