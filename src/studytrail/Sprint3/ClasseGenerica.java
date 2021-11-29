package studytrail.Sprint3;

public class ClasseGenerica<T> {
    private T value;

    public ClasseGenerica(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
