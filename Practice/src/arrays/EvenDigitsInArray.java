package arrays;

public class EvenDigitsInArray {
    public static void main(String[] args) {
        int[] arr= {1,325,32454,57,567,5668,34,355,35,33,78};
        System.out.println(findEvenDigits(arr));
    }
    static int findEvenDigits(int[] arr)
    {
        int count=0;
        for(int num: arr)
        {
            if(even(num))
                count++;
        }
        return count;
    }

    private static boolean even(int num) {
        int digits=digits(num);
        if(digits%2==0)
        {
            return true;
        }
        return false;

    }
    private static int digits(int num)
    {
        int count=0;
        while(num>0)
        {

            num=num/10;
            count++;
        }
        return count;
    }
}
