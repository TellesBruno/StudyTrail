package studytrail.sprint2;

import java.util.List;
import java.util.stream.Collectors;

public class FeaturesJavaEleven {
    public static void main(String[] args) {
        //New string method
        String str = "Hello World \nHello Country \nHello City";
        System.out.println(str.isBlank());
        List<String> strLines = str.lines().collect(Collectors.toList());
        System.out.println(strLines);
        strLines.add("Hello House");
        int cont = 0;
        for (String s : strLines) {
            cont++;
            System.out.println("Linha "+cont+" : "+s);
        }

        //Rodar diretamente o File .java
        System.out.println("Roda diretamente!");


    }
}
