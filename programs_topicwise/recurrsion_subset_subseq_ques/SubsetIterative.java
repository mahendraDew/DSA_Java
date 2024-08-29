import java.util.ArrayList;
import java.util.List;

public class SubsetIterative {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> list = iterative(arr);
        System.out.println(list);
        System.out.println("with duplicate:");
        System.out.println(iterativeDup(arr));
    }
    public static List<List<Integer>> iterative(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int ele: arr){
            int outerSize = outer.size();
            for(int i = 0; i<outerSize; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(ele);
                outer.add(inner);
            }
        }
        return outer;
    }

    //subset if the string is duplicate ex {1,2,2} = [][1][2][1,2][2][1,2][2,2][1,2,2] but we want it to print without duplicate=>[][1][2][1,2][2,2][1,2,2]
    public static List<List<Integer>> iterativeDup(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0; i<arr.length; i++){
            start = 0;
            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size() -1;
            int outerSize = outer.size();
            for(int j = start; j<outerSize; j++){
                List<Integer> list = new ArrayList<>(outer.get(j));
                list.add(arr[i]);
                outer.add(list);
            }

        }
        return outer;
    }
}
