public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,33,4,11,9,0,88,5};
        int target = 12;
        System.out.println(linearSearch(arr, target));
    }
    static boolean linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == target){
                System.out.println("the item were found at index " + i);
                return true;
            }
        }
        return false;
    }
}
