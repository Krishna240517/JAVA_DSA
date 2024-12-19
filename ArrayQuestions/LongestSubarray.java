public class LongestSubarray {
    //given an array of positive integers
    //return the longest subarray length with given sum K
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(findLongestSubarrayLength(arr, k));
    }

    public static int findLongestSubarrayLength(int[] arr,int k){
        int i = 0;
        int j = 1;
        int len = 0;
        int sum = arr[0];
        while(j < arr.length){
            sum = sum + arr[j];
            while(sum > k && i<=j){
                sum-=arr[i];
                i++;
            }
            if(sum == k){
                len = Math.max(len,j-i+1);
            }
            j++;
        }
        return len;
    }
}
