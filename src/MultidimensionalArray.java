import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {1,2,3}, // 0th index
                {4,5,6}, // 1st index
                {7,8,9}  // 2nd index
        };
        System.out.println(arr[2][1]);
        int[][] arr1 = new int[3][3];
        System.out.println("Enter Array Input :)");
        for(int row = 0; row < arr1.length; row++){
            for(int col = 0; col<arr1[row].length; col++){
                arr1[row][col] = in.nextInt();
            }
        }
        for(int row = 0; row < arr1.length; row++){
//            for(int col = 0; col<arr1[row].length; col++) {
//                System.out.println(arr1[row][col]);
                System.out.println(Arrays.toString(arr1[row]));
            }
//            System.out.println();
        }
    }
//}
