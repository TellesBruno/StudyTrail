package studytrail.sprint2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        //Collection to Array
        List<String> listNames = Arrays.asList("João", "Maria", "José", "Carlos", "Ana", "Paulo");
        System.out.println("Como Lista: "+listNames);
        String[] arrayNames = listNames.toArray(new String[listNames.size()]);
        System.out.println("Como Array: ");
        Stream.of(arrayNames).forEach(System.out::println);

        //Local Varaiable Syntax
        MyFunctionalInterface myLambdaFunc = (var nome, var Sobrenome) -> {
            return nome + " " + Sobrenome;
        };
        System.out.println(myLambdaFunc.concatenaString("João", "Silva"));
    }
}
