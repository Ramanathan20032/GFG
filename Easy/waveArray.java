package Easy;

import java.util.Arrays;

public class waveArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        convertToWave(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void convertToWave(int[] arr){
        for (int i = 0; i < arr.length - 1; i=i+2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
