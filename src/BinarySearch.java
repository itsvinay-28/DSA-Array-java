public class BinarySearch {
    static int Search(int []arr , int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < target) {
                left = mid + 1;
            } else if(arr[mid] > target) {
                right = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        System.out.println(Search(arr,target));
    }
}
