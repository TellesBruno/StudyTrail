package studytrail.Sprint3;

public class ClasseGenericaFilha<T> extends ClasseGenerica<T> {
    private T otherValue;
    public ClasseGenericaFilha(T value, T otherValue) {
        super(value);
        this.setValue(value);
        this.otherValue = otherValue;
    }

    public T getOtherValue() {
        return otherValue;
    }

    public void setOtherValue(T otherValue) {
        this.otherValue = otherValue;
    }
}
