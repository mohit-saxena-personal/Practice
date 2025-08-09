package arrays;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {345,333,55,50,46,34,25};
        int target = 34;
        System.out.println(orderAgnosticBS(arr,target));
    }

    private static int orderAgnosticBS(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        boolean isAsc= arr[start] < arr[end];
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAsc)
            {
                if(arr[mid] > target)
                {
                    end = mid-1;
                }else start=mid+1;
            }
            else{
                if(arr[mid] < target)
                {
                    end = mid-1;
                }else start=mid+1;
            }

        }
        return -1;
    }
}
