package studytrail.sprint2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FeaturesJavaNine {
    public static void main(String[] args) {
        //Private methods in functional interfaces
        System.out.println(MyFunctionalInterface.testPrivate());

        //Factory methods
        List<String> list = List.of("a", "b", "c");
        System.out.println(new ArrayList<>(list));
        Map<String, String> map = Map.of("a", "b", "c", "d");
        System.out.println(map);

        //Try With Resources
        try (Scanner scanner = new Scanner(new File("resources/test.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        //finally {
//          if (scanner != null) {
//              scanner.close();
//          }
//        }
    }
}
