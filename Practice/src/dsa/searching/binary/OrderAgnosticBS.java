package dsa.searching.binary;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 23, 25, 56, 78, 90};
        int[] arr2 = {90,78,56,48,35,20,10,5};
        int target = 90;
        System.out.println(orderAgnosticBS(arr,target));
        System.out.println(orderAgnosticBS(arr2,target));
    }
    static int orderAgnosticBS(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
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
