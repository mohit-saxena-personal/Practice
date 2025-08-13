package dsa.searching.binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 23, 25, 56, 78, 90};
        int target = 90;
        System.out.println(binarySearch(arr,target));
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(target>arr[mid]){
                start = mid +1;
            }
            else if(target< arr[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
