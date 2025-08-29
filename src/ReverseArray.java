import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr = {12,3,3,5,3,2};
       reverse(arr);
    }
    public static void reverse(int []arr){
        int left =0;
        int right = arr.length-1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
