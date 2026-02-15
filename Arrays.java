import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

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

        // System.out.println("Maximum element : " + max);
        // System.out.println("Sum of an array is : " + sum);

    }
}
