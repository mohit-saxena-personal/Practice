package java8;

interface Calculator{
    int subtract(int a,int b);
}
public class Lambda {
    public static void main(String[] args) {
        //Calculator calculator = (a,b)-> a-b;
        Calculator calculator = (a,b)->{
            if(a<b){
                throw new RuntimeException("Error");
            }
            else {
                return a-b;
            }
        };
        System.out.println("Result is:"+calculator.subtract(10,5));
    }
}
