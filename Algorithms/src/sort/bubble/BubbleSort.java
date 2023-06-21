package sort.bubble;

import java.util.Random;

public class BubbleSort {

    static private void bubbleSort(int[] arr){
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    static private void swap(int[] arr,int f,int t){
        int temp = arr[t];
        arr[t] = arr[f];
        arr[f] = temp;
    }

    private static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int[] n = new int[10];

        for(int i=0;i<n.length;i++){
            n[i] = rand.nextInt(100);
        }

        System.out.println("Before");
        printArr(n);
        System.out.println("\nAfter");
        bubbleSort(n);
        printArr(n);
        
    }
}
