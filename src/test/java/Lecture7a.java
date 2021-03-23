import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Lecture7a {
    
    @Test
    @DisplayName("Reduce Test -sum ")
    void reduceSumTest(){
        Integer [] integers = {1,2,3,4,5,6};
        Integer sum = Arrays.stream(integers)
                .reduce(0, Integer::sum);
        System.out.println("sum = " + sum);
        
    }

    @Test
    @DisplayName("Reduce Test -multiply ")
    void reduceMultiplyest(){
        Integer [] integers = {1,2,3,4,5,6};
        Integer multiply = Arrays.stream(integers)
                .reduce(1, (a,b) -> a*b);
        System.out.println("multiply = " + multiply);

    }


}
