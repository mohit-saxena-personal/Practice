package interview;

public class StirngVowels {
    public static void main(String[] args) {
        System.out.println(hasVowels("tva"));

    }
    public  static boolean hasVowels(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
