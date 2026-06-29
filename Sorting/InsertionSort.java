package Sorting;

import java.lang.reflect.Array;

public class InsertionSort {

    public static void insertionSort(int[] arr){

        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;
            for(j = i-1; j >= 0; j--){
                if(arr[j] > key){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {1,3,4,5,6,7,2};
        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
