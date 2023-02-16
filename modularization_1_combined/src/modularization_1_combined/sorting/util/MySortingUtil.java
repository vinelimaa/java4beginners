package modularization_1_combined.sorting.util;

import java.util.List;

import modularization_1_combined.sorting.algorithm.BubbleSort;

public class MySortingUtil {

	public List<String> sort(List<String> names) {

		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort.sort(names);
	}
}
