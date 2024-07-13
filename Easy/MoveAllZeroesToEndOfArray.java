package Easy;

import java.util.Arrays;

public class MoveAllZeroesToEndOfArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 12};
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void pushZerosToEnd(int[] arr) {
        // code here
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i = index; i < arr.length; i++){
            arr[i] = 0;
        }
    }
}
