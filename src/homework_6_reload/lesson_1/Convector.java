package homework_6_reload.lesson_1;

import java.util.List;
import java.util.stream.Collectors;

public class Convector {

    public List<String> toUpperCaseConvector(List<String> collection) {
        List<String> collect = collection
                .stream()
                .map(each -> each.toUpperCase())
                .collect(Collectors.toList());
        return collect;
    }
}
