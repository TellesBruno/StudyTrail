package studytrail.sprint2;

public final class Person implements MySealedInterface {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Olá meu nome é: " + name);
    }
}
