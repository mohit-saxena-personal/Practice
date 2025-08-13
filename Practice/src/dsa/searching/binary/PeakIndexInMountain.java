package dsa.searching.binary;

public class PeakIndexInMountain {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,4,3,2};
        System.out.println(binarySearch(arr));
    }
    private static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = (start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
        }
        return arr[start];
    }
}
