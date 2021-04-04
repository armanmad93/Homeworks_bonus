package homework_6_reload.lesson_5;

import java.util.List;

public class Count {
    public Integer SumOfElements(List<Integer> integerList) {
        int sum = integerList.stream()
                .mapToInt(number -> number).sum();

        return sum;
    }
}
