import java.util.Arrays;

// Finding The largest Kth number and print in the ascending order.

public class FindKthLargest1 {
    static void findlargest(int []arr, int k){
        int n = arr.length;
        Arrays.sort(arr);
        k  = n-k;
        for (int i = k; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,5,66,8,8,99};
        int k = 3;
            findlargest(arr,k);
      }
    }
