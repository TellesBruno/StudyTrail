package studytrail.sprint2;

import java.util.function.*;

public class FeaturesJavaOito {
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
    }
}
