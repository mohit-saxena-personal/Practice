package interview;

public class MaxItemInArray {
    public static void main(String[] args) {
        int[] arr = {76,8,34,44,67,98,76,56};
        System.out.println(max(arr));
    }

    private static int max(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
