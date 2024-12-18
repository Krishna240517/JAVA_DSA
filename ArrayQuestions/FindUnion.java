import java.util.ArrayList;
public class FindUnion{
    public static void main(String[] args){
        int[] a = {1,1,2,3,3,4,5};
        int[] b = {2,2,2,3,3,4,6,6,6,7};
        System.out.println(findUnion(a, b));
    }

    public static ArrayList<Integer> findUnion(int[] a,int[] b){
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        list.add(Math.min(a[i],b[j]));
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                if(list.getLast() != a[i] || list.size()==0){
                    list.add(a[i]);
                }
                i++;
            } else {
                if(list.getLast() != b[j] || list.size()==0){
                    list.add(b[j]);
                    
                }
                j++;
            }
        }

        while(i < a.length){
            if(list.getLast() != a[i]){
                list.add(a[i]);
            }
            i++;
        }
        while(j < b.length){
            if(list.getLast() != b[j]){
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }
}