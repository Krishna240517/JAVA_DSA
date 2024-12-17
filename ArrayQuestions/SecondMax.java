public class SecondMax{
    public static void main(String[] args) {
        System.out.println(returnSecondLargest(new int[]{7,5,6,9,9,3,8}));
    }
    public static int returnSecondLargest(int[] arr){
        int max = arr[0];
        int smax = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            } else {
                if(arr[i] < max && arr[i] > smax){
                    smax = arr[i];
                }
            }
        }
        return smax;
    }
}