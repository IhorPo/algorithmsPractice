package sort.selection;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6,2,5,8,5,21,1,6,7};

        selection(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0;i< arr.length;i++){
            int min = i;
            for(int j=i;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            swap(arr,min,i);
        }
    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
