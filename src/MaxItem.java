import java.util.Arrays;
import java.util.Scanner;
public class MaxItem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int[] arr = new int[in.nextInt()];
        System.out.println("the length of the array is = " + arr.length + " so the index will be = " + (arr.length - 1));
        System.out.println("Enter the Elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Proper format of Array " + Arrays.toString(arr));
        int maxVal = Max(arr);
        System.out.println("The Maximum Number in the given array is = " + maxVal);
    }
    static int Max (int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
