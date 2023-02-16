package modularization_1_combined.consumer;

import java.util.List;
import java.util.logging.Logger;

import modularization_1_combined.sorting.util.MySortingUtil;

public class MySortingUtilConsumer {

	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

	public static void main(String[] args) {
		MySortingUtil util = new MySortingUtil();
		List<String> sorted = util.sort(List.of("Vinincius", "Kelly", "Nicollas", "Hilory", "Arthur"));
		logger.info(sorted.toString());
	}
}
