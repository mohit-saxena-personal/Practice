package dsa.searching.binary;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,8,10};
        int m = 2;

        System.out.println(maxSum(arr,m));
    }
    static int maxSum(int[] nums,int m){
        int start = 0;
        int end = 0;
        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);
            end +=nums[i];
        }
        //binary search
        while (start<end){
            //try for the mid as potential ans
            int mid = (start+end)/2;
            //calculate how many peaces we can divide this with max sum
            int sum = 0;
            int pieces = 1;
            for(int num: nums){
                if(sum + num > mid){
                    // you cannot add this in subarray, make new one
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }
            if(pieces>m){
                start = mid +1;
            }else {
                end = mid;
            }
        }
        return end;
    }
}
