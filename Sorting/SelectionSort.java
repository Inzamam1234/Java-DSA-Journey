package Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int mid_Index = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[mid_Index]) {
                    mid_Index = j;
                }
            }
            if (mid_Index != i) {
                int temp = arr[i];
                arr[i] = arr[mid_Index];
                arr[mid_Index] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 10, 22, 33, 45, 67, 12, 32 };

        System.out.println("Sorted Array:");

        selectionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
