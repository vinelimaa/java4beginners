package multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask(" ByTheWay"), new CallableTask(" Otherside"),
				new CallableTask(" Californication"));

//		List<Future<String>> results = executorService.invokeAll(tasks);

//		for (Future<String> result : results) {
//			System.out.println(result.get());
//		}

		String result1 = executorService.invokeAny(tasks);

		System.out.println(result1);

		executorService.shutdown();

	}

}
