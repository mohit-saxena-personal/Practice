package dsa.searching.linear;

public class MaxSumIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5},
                {7,3},
                {3,5,5}
        };
        System.out.println(maxSum(arr));
    }

    private static int maxSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        for(int row=0; row<arr.length; row++){
            int sum = 0;
            for(int col=0; col<arr[row].length; col++){
                sum = sum + arr[row][col];
            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return maxSum;
    }
}
