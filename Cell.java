public class Cell<T> {
    private T data;

    public void setValue(T data) {
        this.data = data;
    }

    public T getValue() {
        return data;
    }

    public void displayType() {
        System.out.println("Tipe data: " + data.getClass().getSimpleName());
    }
}