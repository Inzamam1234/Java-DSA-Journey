package TCS;
import java.util.*;
public class Arrays_problems {
    
    public static void MoveAllZeroesToEnd(int arr[]){

        int nz = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[nz] = arr[i];
                nz++;
            }
        }
        for(int i = nz; i < arr.length; i++){
            arr[i] = 0;
        }
    }

    public static void RotateArrayByK(int arr[], int k){

        int n = arr.length;

        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);

    }

    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the K roatation to make : ");
        int k = sc.nextInt();
        k = k % arr.length;

        //MoveAllZeroesToEnd(arr);
        RotateArrayByK(arr, k);
        System.out.println(Arrays.toString(arr));

        //System.out.println(Arrays.toString(arr));

    }
}
