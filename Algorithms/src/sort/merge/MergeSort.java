package sort.merge;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6,2,5,8,5,21,1,6,7};

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr){
        int arrLength = arr.length;
        if(arrLength < 2){
            return;
        }
        int midIndex = arrLength / 2;
        int[] leftArr = new int[midIndex];
        int[] rightArr = new int[arrLength - midIndex];

        for(int i=0;i<midIndex;i++){
            leftArr[i] = arr[i];
        }

        for(int i=midIndex;i<arrLength;i++){
            rightArr[i - midIndex] = arr[i];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(arr,leftArr,rightArr);

    }

    static void merge(int[] arr,int[] leftArr, int[] rightArr){
        int leftLength = leftArr.length;
        int rightLength = rightArr.length;

        // i - responsible for left array
        // j - responsible for right array
        // k - responsible for main array
        int i=0,j=0,k=0;

        while(i<leftLength && j<rightLength){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i<leftLength){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j<rightLength){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
