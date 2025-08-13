package dsa.searching.binary;

import java.util.Arrays;

public class FistAndLastOcc {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(findElementIndex(arr,target)));
    }
    static int[] findElementIndex(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0] = search(arr,target,true);
        ans[1] = search(arr,target,false);

        return ans;
    }
    static int search(int[] arr,int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = (start+end)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
               ans = mid;
               if(findStartIndex){
                   end = mid -1;
               }else {
                   start = mid + 1;
               }
            }
        }
        return ans;
    }
}
