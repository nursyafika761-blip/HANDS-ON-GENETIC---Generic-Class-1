public class Main {
    public static void main(String[] args) {

        Cell<Integer> integerCell = new Cell<>();
        integerCell.setValue(100);

        Cell<String> stringCell = new Cell<>();
        stringCell.setValue("Hello");

        System.out.println("Nilai Integer: " + integerCell.getValue());
        integerCell.displayType();

        System.out.println();

        System.out.println("Nilai String: " + stringCell.getValue());
        stringCell.displayType();
    }
}