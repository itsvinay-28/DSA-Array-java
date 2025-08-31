

public class LinearSearch {
    static int Search(int []arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {2,3,4,5,6,1};
        int target = 6;
        int result = Search(arr,target);
        System.out.println(result);
    }
}
