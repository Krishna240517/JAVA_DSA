public class LinearSeach {
    public static void main(String[] args) {
        int[] arr = {5,2,6,9,14,23,1,0,8};
        int target = 1; //output : 6
        int val = findTarget(arr, target);
        if(val != -1){
            System.out.println("Element is found in index: "+val);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int findTarget(int[] arr,int target){
        //performing linear search to find the target in the given array
        //return the index if the element is found or else return -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
