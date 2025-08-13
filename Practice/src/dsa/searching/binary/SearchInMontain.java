package dsa.searching.binary;

public class SearchInMontain {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,4,2};
        int target = 2;
        System.out.println(search(arr, target));
    }

    private static int search(int[] arr, int target) {
        int peak = findPeak(arr);
        int firstTry = orderAgnosticBS(arr, target,0, peak);
        {
            if(firstTry != -1){
                return firstTry;
            }
            else{
                return orderAgnosticBS(arr,target,peak+1,arr.length-1);
            }
        }
    }

    private static int findPeak(int[] arr) {
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
        return start;
    }
    static int orderAgnosticBS(int[] arr,int target, int start, int end) {

        //find the sorting order of array
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
