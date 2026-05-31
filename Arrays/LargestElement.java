package Arrays;

public class LargestElement {
    
    public int findlargest(int[] arr){
        int largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        LargestElement le = new LargestElement();
        int[] arr = {3, 5, 7, 2, 90};
        int largest = le.findlargest(arr);
        System.out.println("The largest element in the array is: " + largest);

    }
}