import java.util.Arrays;

public class TwoArrayEqualorNot {

    static boolean check(int []arr1 , int []arr2){
        if(arr1.length != arr2.length) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
            for(int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }

            }
        return true;
    }
    public static void main(String[] args) {
        int []arr1 = {4,3,5,1,2};
        int []arr2 = {1,2,3,4,5};

        System.out.println(check(arr1,arr2));
    }
}
