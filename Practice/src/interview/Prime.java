package interview;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(23));
        System.out.println(isPrime(49));
    }

    private static boolean isPrime(int i) {
        if(i == 0 || i==1)
        {
            return false;
        }
        if(i == 2)
        {
            return true;
        }
        for(int n=2; n <= i/2; n++){
            if(i%n==0){
                return false;
            }
        }
        return true;
    }
}
