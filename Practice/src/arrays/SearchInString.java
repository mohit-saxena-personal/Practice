package arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Mohit";
        char target= 'i';
        System.out.println(search2(name,target));
    }
    static boolean search(String name, char target)
    {
        if(name.isEmpty())
        {
            return false;
        }
        for(int i=0; i<name.length();i++)
        {
            if(target == name.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
    static boolean search2(String name, char target)
    {
        if(name.isEmpty())
        {
            return false;
        }
        for(char ch: name.toCharArray())
        {
            if(ch==target) {
                return true;
            }
        }
        return false;
    }
}
