package arrays;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,324,325,346,457},
                {235,5235,345,236,326},
                {35,325,325},
                {45,568,679,760}
        };
        int target=760;
        int[] ans =search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target)
    {
        for(int row=0; row<arr.length;row++)
        {
            for(int col=0; col<arr[row].length;col++)
            {
                if(arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
