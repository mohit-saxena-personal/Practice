package generic;

public class Print<T> {
    T value;

    public Print() {

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
