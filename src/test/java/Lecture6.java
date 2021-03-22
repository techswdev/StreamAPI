import beans.Car;
import com.google.common.collect.Lists;
import mockdata.MockData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lecture6 {

    @Test
    @DisplayName("Grouping Test")
    void groupingTest() throws IOException {
        Map<String, List<Car>> collect = MockData.getCars()
                .stream()
                .collect(Collectors.groupingBy(Car::getMake));

        collect.forEach((company, cars)-> {
                    System.out.println("company = " + company);
                    cars.forEach(car-> System.out.println("car = " + car));
                }
        );
    }

    @Test
    @DisplayName("Grouping and CountingTest")
    void groupingAndCountingTest() throws IOException {

        ArrayList<String> names = Lists.newArrayList("aa","aa","bb","bb","bb","cc","cc","cc","cc","dd","dd");
        Map<String, Long> collect = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((name,count)-> System.out.println(name + ">" + count));
    }
}
