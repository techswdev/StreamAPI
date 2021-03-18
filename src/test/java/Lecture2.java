import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lecture2 {

    @Test
    public void distinctTest() throws Exception {
        ImmutableList immutableList = ImmutableList.of(1,1,1,1,2,2,2,2,3,3,3,3,4,4);
        immutableList.stream().distinct().forEach(System.out::println);
    }

    @Test
    public void distinctTest2() throws Exception {
        List<Integer> number= ImmutableList.of(1,1,1,1,2,2,2,2,3,3,3,3,4,4);
        List<Integer> collect = number.stream().distinct().collect(Collectors.toList());
        collect.stream().forEach(integer -> System.out.println(integer));
    }

    @Test
    public void distinctTest3() throws Exception {
        List<Integer> distinctName = ImmutableList.of(1,1,1,1,2,2,2,2,3,3,3,3,4,4);
        Set<Integer> collect = distinctName.stream().collect(Collectors.toSet());
        System.out.println("collect = " + collect);
    }

}