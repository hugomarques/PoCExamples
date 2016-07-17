import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by marquesh on 3/31/15.
 */
public class MergeMapsTest {

  private Metrics<List, Map> metricHelper = new Metrics<>();


  @Test
  public void mergeTwoMapsWithStreamTest() {
    Map<Integer, String> map1 = new HashMap<>();
    map1.put(1, "a");
    map1.put(2, "b");
    Map<Integer, String> map2 = new HashMap<>();
    map2.put(3, "a");
    map2.put(4, "b");
    Map<Integer, String> mapResult = new HashMap<>();
    mapResult.put(1, "a");
    mapResult.put(2, "b");
    mapResult.put(3, "a");
    mapResult.put(4, "b");
    Assert.assertEquals(mapResult.toString(), MergeMaps.mergeWithStreams(Arrays.asList(map1, map2)).toString());
  }

  @Test
  public void mergeMapsWithStreamTest() {
    Map<Integer, String> map1 = new HashMap<>();
    map1.put(1, "a");
    map1.put(2, "b");
    Map<Integer, String> mapResult = new HashMap<>();
    mapResult.put(1, "a");
    mapResult.put(2, "b");
    Assert.assertEquals(mapResult.toString(), MergeMaps.mergeWithStreams(Arrays.asList(map1)).toString());
  }

  @Test
  public void mergeEmptyWithStreamTest() {
    Map<Integer, String> map1 = new HashMap<>();
    Map<Integer, String> mapResult = new HashMap<>();
    Assert.assertEquals(mapResult.toString(), MergeMaps.mergeWithStreams(Arrays.asList(map1)).toString());
  }

  @Test
  public void mergeTwoMapsTest() {
    Map<Integer, String> map1 = new HashMap<>();
    map1.put(1, "a");
    map1.put(2, "b");
    Map<Integer, String> map2 = new HashMap<>();
    map2.put(3, "a");
    map2.put(4, "b");
    Map<Integer, String> mapResult = new HashMap<>();
    mapResult.put(1, "a");
    mapResult.put(2, "b");
    mapResult.put(3, "a");
    mapResult.put(4, "b");
    Assert.assertEquals(mapResult.toString(), MergeMaps.merge(Arrays.asList(map1, map2)).toString());
  }

  @Test
  public void mergeMapsTest() {
    Map<Integer, String> map1 = new HashMap<>();
    map1.put(1, "a");
    map1.put(2, "b");
    Map<Integer, String> mapResult = new HashMap<>();
    mapResult.put(1, "a");
    mapResult.put(2, "b");
    Assert.assertEquals(mapResult.toString(), MergeMaps.merge(Arrays.asList(map1)).toString());
  }

  @Test
  public void mergeEmptyTest() {
    Map<Integer, String> map1 = new HashMap<>();
    Map<Integer, String> mapResult = new HashMap<>();
    Assert.assertEquals(mapResult.toString(), MergeMaps.merge(Arrays.asList(map1)).toString());
  }

  @Test
  public void testPerformance() {
   List list = IntStream.range(1, 10000)
        .mapToObj(a -> {Map map = new HashMap<>(); map.put(a, "a"); return map;})
            .collect(Collectors.toList());

    metricHelper.executeOperationLoggingTime(param -> MergeMaps.merge(param), list, "Merge");
    metricHelper.executeOperationLoggingTime(param -> MergeMaps.mergeWithStreams(param), list, "Merge with Streams");
    metricHelper.executeOperationLoggingTime(param -> MergeMaps.mergeWithParallelStreams(param), list, "Merge with parallel Streams" );
  }


}
