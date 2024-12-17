import java.util.Arrays;
public class MoveZeroes{
    public static void main(String[] args){
        int[] arr = {1,6,0,0,2,4,5,0,0,9,7};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZero(int[] arr){
        int i = 0;
        int j = 1;
        while(j < arr.length){
            if((arr[i]!=0 && arr[j]!=0) || (arr[i]!=0 && arr[j]==0)){
                i++;
                j++;
            } else if(arr[i] == 0 && arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else if(arr[i]==0 && arr[j]==0){
                j++;
            }
        }
    }
}