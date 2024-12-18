import java.util.Arrays;

public class LeftRotateArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 2;
        LeftRotateArray obj = new LeftRotateArray();
        obj.leftRotate(arr,d);
        System.out.println(Arrays.toString(arr));
    }
    public void leftRotate(int[] arr,int d){
        reverse(0, d-1, arr);
        reverse(d, arr.length-1, arr);
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