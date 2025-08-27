public class LargestElements {
    public static void main(String[] args) {
        int []arr = { 5,1,2,3,14,25};

        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
