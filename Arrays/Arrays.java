package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {

    public static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void ReverseArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1; // Two pointers

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end]; // Swap
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static int SecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    public int findlargest(int[] arr){
        int largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int FrequencyCount(int[] arr, int target) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static boolean IsSortedDesending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) { // Decending Order
                return false;
            }
        }
        return true;
    }

    public static boolean IsSortedAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) { // Asending Order
                return false;
            }
        }
        return true;
    }

    public static void LeftRotateByOne(int[] arr) {
        int first = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
    }

    public static void RightRotateByOne(int[] arr) {
        int last = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = last;
    }

    public static void LeftRotate(int arr[], int k) {

        int n = arr.length;

        k = k % n;

        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);

        reverse(arr, 0, n - 1);

    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void MoveZerosToEnd(int[] arr) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static int maxSubArray(int arr[]){

        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){

            currentsum += arr[i];

            if(currentsum > maxsum){
                maxsum = currentsum;
            }

            if(currentsum < 0){
                currentsum = 0;
            }
        }
        return maxsum;
    }

    public static void leftRotateByK(int[] arr, int k) {

        k = k % arr.length;   // handle k > length

        for (int i = 0; i < k; i++) {
            LeftRotateByOne(arr);
        }
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arraySum = 0;

        for (int num : nums) {
            arraySum += num; // Sum of elements in the array
        }

        return totalSum - arraySum; // The missing number is the difference
    }

    public boolean isSorted(int[] arr){

        for(int i = 1; i < arr.length; i++){       // Start from the second element and compare with the previous one
            if(arr[i] < arr[i-1]){                 // If the current element is less than the previous one, the array is not sorted
                return false;                      // Return false immediately if we find any pair of elements that are out of order
            }
        }
        return true;
    }

    public static ArrayList<Integer> removeDuplicates(int arr[]) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (arr.length == 0) {
            return ans;
        }

        int rd = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[rd]) {
                rd++;
                arr[rd] = arr[i];
            }
        }

        for (int i = 0; i <= rd; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }

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

    public static int maxSubarray(int [] arr){ // Maximum Subarray
        
        int currsum = arr[0];
        int maxsum = arr[0];

        for(int i = 1; i < arr.length; i++){
            
            currsum = Math.max(arr[i], currsum + arr[i]);
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    }

    public static int maxiumumProfit(int arr[]){ // Best Time to Buy and Sell Stock

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] < minprice){
                minprice = arr[i];
            }
            int profit = arr[i] - minprice;

            if(profit > maxprofit){
                maxprofit = profit;
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
    }
}
