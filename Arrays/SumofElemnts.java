package Arrays;

import java.util.Scanner;

public class SumofElemnts {

    public static int SumOfElements(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int[] RunningSum(int arr[]) {

        int result[] = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            result[i] = arr[i] + result[i - 1];
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(SumOfElements(arr));
        System.out.println(RunningSum(arr));

    }
}
