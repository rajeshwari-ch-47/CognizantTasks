
public class t40_virtualthreads {

    public static void main(String[] args) throws InterruptedException {
        int count = 100_000;

        Runnable task = () -> System.out.println("Hello from virtual thread: " + Thread.currentThread());

        for (int i = 0; i < count; i++) {
            Thread.startVirtualThread(task);
        }

        // Small pause to let threads finish
        Thread.sleep(2000);
        System.out.println("Finished launching " + count + " virtual threads.");
    }
}
