import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    static void reverse(int []arr, int start , int end){
        while ( start <= end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void RotateDthplace(int []arr, int d){
        int n = arr.length;
        d = d % n;

        reverse ( arr , 0 , d-1);
        reverse( arr , d , n-1);
        reverse( arr , 0 , n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {1,2,3,4,5,6};
        System.out.println(" Enter a vale of Dth :");
        int d = sc.nextInt();
        RotateDthplace(arr , d);
       System.out.println(Arrays.toString(arr));
    }

}
