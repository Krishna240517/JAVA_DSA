public class AppearOnce {
    /*
     * Given a non-empty array of integers arr, 
     * every element appears twice except for one element. 
     * Find that element.
     */
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,3,3,4,6,6};
        System.out.println(findUnique(arr));
    }

    public static int findUnique(int[] arr){
        int unique = 0;
        for(int num : arr){
            unique = unique ^ num;
        }
        return unique;
    }
}
