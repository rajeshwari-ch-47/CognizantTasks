
import java.util.*;
import java.util.concurrent.*;

public class t41_executorcallable {

    // A Callable task that returns square of a number
    static class SquareTask implements Callable<Integer> {

        private int number;

        public SquareTask(int number) {
            this.number = number;
        }

        @Override
        public Integer call() throws Exception {
            return number * number;
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Future<Integer>> results = new ArrayList<>();

        // Submit 5 tasks
        for (int i = 1; i <= 5; i++) {
            Callable<Integer> task = new SquareTask(i);
            Future<Integer> future = executor.submit(task);
            results.add(future);
        }

        // Retrieve results
        for (int i = 0; i < results.size(); i++) {
            System.out.println("Square of " + (i + 1) + " is: " + results.get(i).get());
        }

        executor.shutdown();
    }
}
