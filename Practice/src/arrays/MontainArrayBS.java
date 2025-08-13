package arrays;

public class MontainArrayBS {

    public static void main(String[] args) {
    int arr[] = {1,4,6,9,10,7,40};
        System.out.println(mountain(arr));

    }

    public static int mountain(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}
