public class MaxConsecutiveOnes{
    public static void main(String[] args){
        int[] arr = {1,1,1,15,12,3,1,1,1,1,6,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] arr){
        int len = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                count++;
            } else {
                len = Math.max(len,count);
                count = 0;
            }
        }
        return count > len ? count : len;
    }
}