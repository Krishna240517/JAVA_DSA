import java.util.Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        RightRotateArray obj = new RightRotateArray();
        obj.rightRotate(arr,d);
        System.out.println(Arrays.toString(arr));
    }

    public void rightRotate(int[] arr,int d){
        reverse(arr.length-d,arr.length-1,arr);
        reverse(0,arr.length-d-1,arr);
        reverse(0,arr.length-1,arr);
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
