package interview;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,56,78,78791};
        System.out.println(findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++)
        {
            int digits = findDigits(nums[i]);
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }

    private static int findDigits(int num) {
        int count=0;
        while (num >0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
