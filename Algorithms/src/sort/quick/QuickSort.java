package sort.quick;

import java.util.Random;

public class QuickSort {

    private static void quickSort(int[] array,int lowIndex, int highIndex){
        // situation when only one value left in the array
        if(lowIndex >= highIndex){
            return;
        }

        int pivot = array[highIndex];

        int lp = lowIndex;
        int rp = highIndex;

        while(lp < rp){
            while(array[lp] <= pivot && lp < rp){
                lp++;
            }

            while(array[rp] >= pivot && lp < rp){
                rp--;
            }
            swap(array,lp,rp);
        }
        swap(array,lp,highIndex);

        quickSort(array,lowIndex,lp-1);
        quickSort(array,lp+1,highIndex);
    }

    private static void swap(int[] arr, int f, int t){
        int y = arr[t];
        arr[t] = arr[f];
        arr[f] = y;
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
        quickSort(n,0,n.length-1);
        printArr(n);
    }
    private static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
