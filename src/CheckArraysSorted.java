public class CheckArraysSorted {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,9,6};
        System.out.println(Check(arr));
    }
    public static boolean Check(int[]arr){
        for (int i = 0; i<arr.length-1;i++) {
            if(arr[i] != arr[i+1] && arr[i] > arr[i+1]){
               return false;
            }
        }
        return true;
    }
}
