package arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums ={12,543,46,547,658,969,959,456};
        int target = 456;
        int ans = linerSearch(nums, target);
        System.out.println(ans);

    }
    static int linerSearch(int[] arr, int target)
    {
        if(arr.length == 0){
            return -1;
        }
        for (int index=0; index < arr.length; index++)
        {
            if(arr[index]==target)
            {
                return index;
            }
        }
        return -1;
    }
}
