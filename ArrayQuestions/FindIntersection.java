import java.util.List;
import java.util.ArrayList;
public class FindIntersection{
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,5,6,7};
        int[] arr1 = {2,3,4,5,6};
        System.out.println(findIntersection(arr, arr1));
    }

    public static List<Integer> findIntersection(int[] a,int[] b) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                i++;
            } else if(a[i] > b[j]){
                j++;
            } else {
                if(list.size()==0 || list.getLast() != a[i]){
                    list.add(a[i]);
                }
                i++;
                j++;
            }
        }
        return list;
    }
}