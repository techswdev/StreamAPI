import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture4 {
    
    @Test
    @DisplayName("join Test")
    public void joinTest(){
    List<String> names = ImmutableList.of("apple, banana, orange");
        String collect = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining());
        System.out.println("collect = " + collect);

    }
}
