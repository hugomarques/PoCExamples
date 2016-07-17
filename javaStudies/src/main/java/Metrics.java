import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * Created by marquesh on 3/31/15.
 */
public class Metrics<T, K> {

  public K executeOperationLoggingTime(Function<T, K> lambda, T params, String message) {
    long startTime = System.nanoTime();
    K result = lambda.apply(params);
    long endTime = System.nanoTime();
    System.out.println(message +": "+TimeUnit.NANOSECONDS.toMillis(endTime - startTime));
    return result;
  }

}
