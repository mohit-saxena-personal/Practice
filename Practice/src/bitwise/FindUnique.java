package bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr= {84,6,2,3,3,4,4,2,6,78,78};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique=0;
        for(int n: arr)
        {
            unique = unique ^ n;
        }return unique;
    }
}
