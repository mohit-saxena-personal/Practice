package arrays;

import java.util.Arrays;
//also known as sinking sort and exchange sort
//best case O(n): array is sorted
//worst case O(n square): sorted in reverse order
public class BubbleSort {
    public static void main(String[] args) {
    int[] arr ={5,4,7,8,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble (int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0; i< arr.length-1; i++){
            swapped=false;
            for(int j=1;j< arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
