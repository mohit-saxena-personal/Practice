package dsa.searching.linear;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {23,45,11,67,8,-76,56,78,90};
        System.out.println(findMin(arr));
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
