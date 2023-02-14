package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {

		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		
		// unique - Set
		// Tree (sorted order)
		// Hash
		// LinkedHash (insertion order)

		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("treeSet" + treeSet);

		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("hashSet" + hashSet);

		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("linkedHashSet" + linkedHashSet);
		
		TreeSet<Integer> numbers = new TreeSet<>(Set.of(12, 34, 54, 65, 99));
		
		System.out.println(numbers.floor(40));// menor igual
		System.out.println(numbers.lower(34));// menor
		System.out.println(numbers.ceiling(36));// maior igual
		System.out.println(numbers.higher(34));// maior que
		System.out.println(numbers.subSet(20, 80)); // intervalo (menor incluso, maior excluso)
		System.out.println(numbers.subSet(20, true, 80, true)); // intervalo (ambos inclusos)
		System.out.println(numbers.subSet(20, false, 80, false)); // intervalo (ambos exclusos)
		System.out.println(numbers.headSet(50));// all numbers before 50
		System.out.println(numbers.tailSet(50));// all numbers after 50

	}

}
