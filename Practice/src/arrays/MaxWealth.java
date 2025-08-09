package arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {3,5,6},
                {1,3,4,5}
        };
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts)
    {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;

            }
            if (sum > ans) {
                ans = sum;
            }
        }
    return ans;
    }
}
