import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture7b {
    
    private static final List<ArrayList<String>> arrayListOfNames = Lists.newArrayList(
            Lists.newArrayList("aa","bb","cc"),
            Lists.newArrayList("11","22","33"),
            Lists.newArrayList("a1","b2","c3")
    );
    
    
    @BeforeEach
    @DisplayName("BeforeSetup() ")
    void setUp(){
        System.out.println("arrayListOfNames = " + arrayListOfNames);
    } 
    
    @Test
    @DisplayName("WithoutFlatMap ")
    void withoutFlatMap(){
        List<String> names = Lists.newArrayList();
        for (ArrayList<String> aa: arrayListOfNames) {
            for(String name : aa){
                names.add(name);
            }
        }
        System.out.println("WithoutFlatMap result = " + names);
    }

    @Test
    @DisplayName("WithFlatMap ")
    void withFlatMap(){
        List<String> collect = arrayListOfNames.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("WithFlatMap result  = " + collect);
        
    }

}
