package arrays;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {1,8,9,18,26,52,68,99};
        int target = 20;
        int ans = findFloor(arr, target);
        System.out.println(ans);
    }
    //return the index: greatest number <= target
    private static int findFloor(int[] arr, int target) {
        if(target < arr[0])
        {
            return -1;
        }
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
        return end;
    }
}
