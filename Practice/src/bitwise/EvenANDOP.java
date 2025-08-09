package bitwise;

public class EvenANDOP {
    public static void main(String[] args) {
        int n=110009;
        System.out.println(isEven(n));
    }

    private static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
