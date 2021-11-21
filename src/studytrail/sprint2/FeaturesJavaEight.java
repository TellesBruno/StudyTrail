package studytrail.sprint2;

import java.util.*;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FeaturesJavaEight {
    public static void main(String[] args) {
        // Lambda Expressions
        MyFunctionalInterface myLambdaFunc = (String nome, String Sobrenome) -> {
            return nome + " " + Sobrenome;
        };
        BinaryOperator<String> myLambdaFunc2 = (String nome, String Sobrenome) -> nome + " " + Sobrenome;

        System.out.println(myLambdaFunc.concatenaString("João", "Silva"));
        System.out.println(myLambdaFunc2.apply("João", "Silva"));
        System.out.println(myLambdaFunc.funcDefault());
        System.out.println(MyFunctionalInterface.funcStatic());

        //Method References
        MyFunctionalInterface myMethodRef = FeaturesJavaEight::referenceMethod;
        System.out.println("\n"+myMethodRef.funcDefault());
        System.out.println(myMethodRef.concatenaString("Maria", "Silva")+"\n");

        //Streams
        Stream<String> stream = Stream.of("João", "Maria", "José", "Paulo");
        stream.forEach(System.out::println);

        List<Integer> nunbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nunbers.add(i);
        }
        System.out.println("\n" + "Even nunbers: ");
        List<Integer> evenNumbers = nunbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        evenNumbers.forEach(System.out::println);
        System.out.println("\n" + "Odd nunbers: ");
        List<Integer> oddNumbers = nunbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        oddNumbers.forEach(System.out::println);
    }

    public static String referenceMethod(String nome, String sobrenome) {
        return sobrenome + ", " + nome + " " + sobrenome;
    }

    public static String secondReferenceMethod() {
        return "Is this work?";
    }
}
