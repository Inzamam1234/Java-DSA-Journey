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

    public static int FrequencyCount(int[] arr, int target){

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of elements for the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        /*
         * int target = 5; //Linear Search
         * 
         * int result = LinearSearch(arr, target);
         * 
         * if(result != -1){
         * System.out.println("Element found at index : " + result);
         * }
         * else{
         * System.out.println("Element Not found !!");
         * }
         * 
         * /*
         * ReverseArray(arr);
         * for (int i = 0; i < arr.length; i++) {
         * System.out.print(arr[i] + " ");
         * }
         */
        
        int freq = FrequencyCount(arr, 1);
        System.out.println("Target count : " + freq);
        


        //int second = SecondLargest(arr);
        //System.out.println("Second Largest in an array : " + second);

        // for(int i = 0; i < arr.length; i++){
        // System.out.print(arr[i] + " "); //Travesal of an array
        // }

        // int sum = 0;
        // for(int i = 0; i < arr.length; i++){
        // sum = sum + arr[i]; //Sum of an array
        // }

        /*
         * int max = arr[0];
         * for(int i = 0; i < arr.length; i++){
         * if(arr[i] > max){ //Maximum element in an array
         * max = arr[i];
         * }
         * }
         */

        /*
         * int min = arr[0];
         * for(int i = 0; i < arr.length; i++){
         * if(arr[i] < min){ //Maximum element in an array
         * min = arr[i];
         * }
         * }
         */

        // System.out.println("Maximum element : " + max);
        // System.out.println("Minimium element : " + min);
        // System.out.println("Sum of an array is : " + sum);

    }
}
