package interview;

public class PeakInMontain {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5,9,6,2,0};
        System.out.println(peakIndex(arr));
    }
    public static int peakIndex(int[] arr ){
        int start = 0;
        int end = arr.length-1;

        while(start < end)
        {
            int mid = start + (end-start)/2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return  start;
    }
}
