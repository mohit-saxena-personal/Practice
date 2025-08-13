package dsa.searching.binary;

public class CeilingString {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'k';
        System.out.println(binarySearch(arr,target));
    }

    private static char binarySearch(char[] arr, char target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(target>arr[mid]){
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }


}
