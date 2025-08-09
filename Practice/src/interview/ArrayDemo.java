package interview;

public class ArrayDemo {

    public static void main(String[] args) {
        //2D array
        //int[][] arr = new int[3][];
        int[][] arr = {
                {1, 2},
                {2, 3, 4},
                {5,6}
        };

        System.out.println(arr.length);
        for(int row=0; row < arr.length; row++)
        {
            for(int col = 0; col < arr[row].length; col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();

        }

    }

}
