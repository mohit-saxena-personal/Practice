package dsa.searching.linear;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1,41,6,8,10,78,68};
        int target = 10;
        System.out.println(linearSearch(arr,target));

    }

    private static int linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
