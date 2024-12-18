import java.util.Arrays;

public class LeftRotateArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int r = 2;
        LeftRotateArray obj = new LeftRotateArray();
        obj.leftRotate(arr,r);
        System.out.println(Arrays.toString(arr));
    }
    public void leftRotate(int[] arr,int r){
        reverse(0, r-1, arr);
        reverse(r, arr.length-1, arr);
        reverse(0, arr.length-1, arr);
    }

    public void reverse(int i,int j,int[] arr){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}