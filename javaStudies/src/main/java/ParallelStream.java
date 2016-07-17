import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by hugomarques on 3/3/15.
 */
public class ParallelStream {

    public static void main(String... args) {
        int max = 1000000;
        final List<String> values = new ArrayList<String>();
        for (int i = 0; i< max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        long millis = getExecutionTime(values, (list) -> list.stream().sorted().count());

        //Simple sort.
        System.out.println(String.format("Sequential sort took: %d ms", millis));

        long millisParallel = getExecutionTime(values, (list) -> list.parallelStream().sorted().count());

        //Usually 50% faster
        System.out.println(String.format("Parallel sort took: %d ms", millisParallel));
    }

    /**
     *
     * @param values
     * @param sortable Sortable strategy.
     * @return
     */
    private static long getExecutionTime(List<String> values, Sortable sortable) {
        long t0 = System.nanoTime();

        long count = sortable.sort(values);

        long t1 = System.nanoTime();

        return TimeUnit.NANOSECONDS.toMillis(t1-t0);
    }

    /**
     * Strategy to abstract the sortable algorithms
     * @param <T>
     */
    interface Sortable<T> {

        long sort(List<T> list);

    }



}
