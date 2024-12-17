public class SecondMin {
    public static void main(String[] args) {
        System.out.println(returnSecondMinimum(new int[]{7,5,6,9,9,3,8}));
    }
    public static int returnSecondMinimum(int[] arr){
        int min = arr[0];
        int smin = -1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                smin = min;
                min = arr[i];
            } else {
                if(arr[i] > min && arr[i] < smin){
                    smin = arr[i];
                }
            }
        }
        return smin;
    }
}
