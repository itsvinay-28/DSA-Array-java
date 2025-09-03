import java.util.Arrays;

// Finding The largest Kth number and print in the ascending order.
public class FindKthLargest2 {

    static void findlargest(int []arr, int k){
        Arrays.sort(arr);
        int n = arr.length;
        k = n-k;
        for (int i = n-1; i >= k; i--) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int []arr = {1,2,3,5,66,8,8,99};
        int k = 3;
        findlargest(arr,k);
        }
    }
