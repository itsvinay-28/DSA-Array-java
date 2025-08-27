public class SecondElements {
    public static void main(String[] args) {
        int []arr={5,1,2,6,5,10,10};
        System.out.println(secondlargest(arr));
    }
    public static int secondlargest(int []arr){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int slargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > slargest && arr[i] != largest){
                slargest = arr[i];
            }
        }
       return slargest;
    }
}
