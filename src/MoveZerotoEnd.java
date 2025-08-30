public class MoveZerotoEnd {
        static void zeros(int []arr){
            int right = arr.length-1;
            int left = 0;
            while ( left< right){
                if(arr[left] == 0 && right != 0){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right]= temp;
                    right--;
                }else{
                    left++;

                }
            }
        }
        public static void main(String[] args) {
            int []arr = {1,1,0,0,0,0,0,0,0,0,1,1,1,1,1};
            zeros(arr);
            for(int i =0 ; i<arr.length;i++){
                System.out.print(arr[i]);
            }
        }
}
