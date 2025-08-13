package dsa.searching.linear;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,35,56},
                {54,55,69,34}
        };
        int target = 34;
        int[] ans= search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] search(int[][] arr, int target) {
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(target == arr[row][col]){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }

}
