package generic;

public class Main {
    public static void main(String[] args) {
        Print<Integer> print = new Print<Integer>();
        print.setValue(1);
        System.out.println(print.getValue());

        Print<String> print2 = new Print<>();
        print2.setValue("Hello");
        System.out.println(print2.getValue().length());
    }
}
