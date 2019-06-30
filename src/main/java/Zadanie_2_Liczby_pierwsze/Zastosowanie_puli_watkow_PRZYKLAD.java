package Zadanie_2_Liczby_pierwsze;

//public class Zastosowanie_puli_watkow_PRZYKLAD {
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Zastosowanie_puli_watkow_PRZYKLAD {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        final AtomicInteger liczbyParzyste = new AtomicInteger(0);
        for (int i = 1; i <= 100000; i++) {
            final int finalI = i;

            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    if (finalI % 2 == 0) {
                        liczbyParzyste.incrementAndGet();
                    }
                }
            });
        }

        threadPool.shutdown();
        threadPool.awaitTermination(1, TimeUnit.HOURS);

        System.out.println("Liczb parzystych jest: " + liczbyParzyste.get());
    }
}
