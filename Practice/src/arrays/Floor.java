package arrays;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,8,9,18,26,52,68,99};
        int target = 35;
        int ans = findCeiling(arr, target);
        System.out.println(ans);
    }

    private static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = (start+end)/2;
            if(target>arr[mid])
            {
                start = mid+1;
            }else if(target<arr[mid])
            {
                end = mid-1;
            }
            else return mid;
        }
        return start;
    }
}
