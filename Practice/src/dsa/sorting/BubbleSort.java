package dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        boolean swapped = false;
        // run steps n-1 times
        for(int i=0; i<arr.length;i++){
            //arr.length-i beacuse we dont need to compare sorted array
             for(int j=1 ;j< arr.length-i; j++ ){
                if(arr[j] < arr[j-1]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   swapped = true;
                }
            }
            // if there are no value swapped in any pass then we can break
            if(!swapped){
                break;
            }
        }
    }

}
