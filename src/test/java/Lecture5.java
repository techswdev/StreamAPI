import beans.Car;
import beans.Person;
import com.google.common.collect.ImmutableList;
import mockdata.MockData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Lecture5 {
    
    @Test
    @DisplayName("count test")
    void counttest() throws Exception{
        long cnt = MockData.getPeople()
                .stream()
                .filter(person -> person.getGender().equalsIgnoreCase("Agender"))
                .count();

        System.out.println("cnt = " + cnt);

    }

    @Test
    @DisplayName("max test")
    void maxtest() throws Exception{
        double maxValue = MockData.getCars()
                .stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPrice)
                .max()
                .orElse(0);

        System.out.println("maxValue = " + maxValue);

    }

    @Test
    @DisplayName("min test")
    void mintest() throws Exception{
        double minValue = MockData.getCars()
                .stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPrice)
                .min()
                .orElse(0);

        System.out.println("minValue = " + minValue);

    }

    @Test
    @DisplayName("average test")
    void averagetest() throws Exception{
        double averageValue = MockData.getCars()
                .stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0);

        System.out.println("averageValue = " + averageValue);

    }

    @Test
    @DisplayName("sum test")
    void sumtest() throws Exception{
        double sumValue = MockData.getCars()
                .stream()
                .mapToDouble(Car::getPrice)
                .sum();
        BigDecimal bigDecimal = BigDecimal.valueOf(sumValue);
        System.out.println("sumValue = " + bigDecimal);

    }
    
    @Test
    @DisplayName("statics test")
    void staticstest() throws Exception{
        DoubleSummaryStatistics doubleSummaryStatistics = MockData.getCars()
                .stream()
                .mapToDouble(Car::getPrice)
                .summaryStatistics();
        System.out.println("doubleSummaryStatistics = " + doubleSummaryStatistics);
        System.out.println("doubleSummaryStatistics.getAverage() = " + doubleSummaryStatistics.getAverage());
        System.out.println("doubleSummaryStatistics.getCount() = " + doubleSummaryStatistics.getCount());
        System.out.println("doubleSummaryStatistics.getSum() = " + doubleSummaryStatistics.getSum());
        System.out.println("doubleSummaryStatistics.getMax() = " + doubleSummaryStatistics.getMax());
        System.out.println("doubleSummaryStatistics.getMin() = " + doubleSummaryStatistics.getMin());
    }


}
