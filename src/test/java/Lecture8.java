import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lecture8 {
    
    @Test
    @DisplayName("Max test")
    void maxTest(){
        final List<Integer> integerList = ImmutableList.of(1,1,2,2,3,4,5);
        Integer maxValue = integerList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("maxValue = " + maxValue);
    }

    @Test
    @DisplayName("Min test")
    void minTest(){
        final List<Integer> integerList = ImmutableList.of(1,1,2,2,3,4,5);
        Integer minValue = integerList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("minValue = " + minValue);
    }


}
