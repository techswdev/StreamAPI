import beans.Person;
import mockdata.MockData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.IntStream;

public class Lecture1 {



    @Test
    @DisplayName("for문")
    public void orignalWay(){
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }


    @Test
    @DisplayName("Stream range 사용")
    public void streamRange(){
        IntStream.range(1,10).forEach(System.out::println);
    }

    @Test
    @DisplayName("Stream rangeClosed 사용")
    public void streamRangeClosed(){
        IntStream.rangeClosed(1,10).forEach(System.out::println);
    }

    @Test
    @DisplayName("Sstream Iterating List 사용")
    public void streamIteratingList() throws IOException {
        List<Person> people = MockData.getPeople();
        IntStream.range(0,people.size())
                .forEach(index -> {
                    Person person = people.get(index);
                    System.out.println("person = " + person);
                }
                );
        
    }
    @Test
    @DisplayName("intStreamIterate 사용")
    public void intStreamIterate(){
        IntStream.iterate(0,operand -> operand+3)
                .filter(number-> number%2 ==0)
                .limit(20)
                .forEach(System.out::println);
    }

}
