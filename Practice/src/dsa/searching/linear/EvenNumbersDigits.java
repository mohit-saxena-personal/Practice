package dsa.searching.linear;

public class EvenNumbersDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896,42,444,-52};
        System.out.println(findCountOfEvenDigitsNumbers(arr));
    }

    private static int findCountOfEvenDigitsNumbers(int[] arr) {
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            int digits = findDigits(arr[i]);
            if(digits % 2 == 0){
                ans++;
            }
        }
        return ans;
    }

    private static int findDigits(int i) {
        int digits = 0;
        while (i>0){
            digits++;
            i = i/10;
        }
        return digits;
    }
}
