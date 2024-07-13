package Easy;

import java.util.*;

public class iterator {
    public static void main(String[] args) {
        int[] arr = {3, 10, 2, 8, 6, 4, 7, 1, 9, 5};
        int target = 5;

        ArrayList<Integer> result = processArray(arr, target);
        System.out.println(result);
    }
    static ArrayList<Integer> processArray(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next() < target){
                iterator.remove();
            }
        }
        Collections.sort(list);
        return list;
    }
}
