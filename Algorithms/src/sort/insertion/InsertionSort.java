package sort.insertion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6,2,5,8,5,21,1,6,7};

        insertion(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for(int x=1;x<arr.length;x++){
            int current = arr[x];
            int y = x-1;
            while(y>=0 && current>arr[y]){
                arr[y+1] = arr[y];
                y--;
            }
            arr[y+1] = current;
        }
    }
}
