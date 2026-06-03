package Arrays;

import java.util.*;

public class LeftRotateArray {

    public void LeftRotate(int arr[], int k) {

        int n = arr.length;

        k = k % n;

        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);

        reverse(arr, 0, n - 1);

    }

    public void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of.elements for the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("insert array elements : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter 'K' value for left roatation : ");
        int k = sc.nextInt();
        
        LeftRotateArray obj = new LeftRotateArray();
        obj.LeftRotate(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
