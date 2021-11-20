package studytrail.sprint2;

@FunctionalInterface
public interface MyFunctionalInterface {
    public abstract String concatenaString (String s1, String s2);

    public default String funcDefault() {
        return "Funciona!";
    }

    public static String funcStatic() {
        return "Funciona tbm!";
    }

    public static String testPrivate() {
        return funcPrivate();
    }

    private static String funcPrivate() {
        return "Funciona privado tbm!";
    }
}
