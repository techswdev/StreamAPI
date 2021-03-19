import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;

public class Lecture3 {

    @Test
    @DisplayName("findAny Test")
    public void findAnytest(){

        Integer[] numbers = {1,2,3,4,5,6};
        Integer anyValue = Arrays.stream(numbers)
                .findAny()
                .get();
        System.out.println("anyValue = " + anyValue);


    }

    @Test
    @DisplayName("findFirst Test")
    public void findFirsttest(){

        Integer[] numbers = {1,2,3,4,5,6};
        Integer firstValue = Arrays.stream(numbers)
                .findFirst()
                .get();
        System.out.println("firstValue = " + firstValue);


        Integer firstValue1 = Arrays.stream(numbers)
                .filter(integer -> integer>3)
                .findFirst()
                .get();
        System.out.println("firstValue1 = " + firstValue1);
    }
}