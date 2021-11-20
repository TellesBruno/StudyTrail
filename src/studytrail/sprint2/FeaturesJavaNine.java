package studytrail.sprint2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FeaturesJavaNine {
    public static void main(String[] args) {
        //Private methods in functional interfaces
        System.out.println(MyFunctionalInterface.testPrivate());

        //Factory methods
        List<String> list = List.of("a", "b", "c");
        System.out.println(new ArrayList<>(list));
        Map<String, String> map = Map.of("a", "b", "c", "d");
        System.out.println(map);
    }
}
