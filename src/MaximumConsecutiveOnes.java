import java.util.Scanner;

// Find the Maximum Consecutive One's
// Ex :- Given an array of: [ 1,1,0,1,1,1,0,1,1] ------ Maximum is : [1,1,1] - 3
public class MaximumConsecutiveOnes {

    static int Maximum(int []arr){
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == 1){
                count++;
                // Math.max return a max value between max and count.
                max = Math.max(max,count);
            }
            else count = 0;
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr = {1,1,0,1,1,1,0,1,1};
        System.out.println(Maximum(arr));
    }
}
