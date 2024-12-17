public class CheckSorted{
    //basically check if array is ascending sorted
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,6};
        System.out.println(isSorted(arr));

    }
    public static boolean isSorted(int[] arr){
        for(int i = 1; i <arr.length;i++){
            if(!(arr[i-1] <= arr[i])) return false;
        }
        return true;
    }
}