import java.util.concurrent.*;

public class Exercise41_ExecutorCallable {

    public static void main(String[] args)
            throws Exception {

        ExecutorService service =
                Executors.newFixedThreadPool(2);

        Callable<Integer> task =
                () -> {

                    int sum = 0;

                    for(int i=1;i<=100;i++) {

                        sum += i;
                    }

                    return sum;
                };

        Future<Integer> future =
                service.submit(task);

        System.out.println(
                "Result = " + future.get());

        service.shutdown();
    }
}