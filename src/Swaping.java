import java.util.Arrays;

public class Swaping {
    public static void main(String[] args) {
        int[] arr = {33,22,56,12,96};
        Swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }
    static void Swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
