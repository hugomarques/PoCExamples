import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by marquesh on 3/31/15.
 */
public class MergeMaps {

  public static Map<?, ?> mergeWithStreams(List<Map<?, ?>> maps) {
    return maps.stream()
        .flatMap(map -> map.entrySet().stream())
        .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
  }

  public static Map<?, ?> mergeWithParallelStreams(List<Map<?, ?>> maps) {
    return maps.stream()
        .flatMap(map -> map.entrySet().parallelStream())
        .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
  }

  public static Map<?, ?> merge(List<Map<?, ?>> maps) {
    Map result = new HashMap<>();
    maps.stream()
        .forEach(
            map -> result.putAll(map)
        );
    return result;
  }

}
