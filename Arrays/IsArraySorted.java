package Arrays;

public class IsArraySorted {
    public boolean isSorted(int[] arr){

        for(int i = 1; i < arr.length; i++){       // Start from the second element and compare with the previous one
            if(arr[i] < arr[i-1]){                 // If the current element is less than the previous one, the array is not sorted
                return false;                      // Return false immediately if we find any pair of elements that are out of order
            }
        }
        return true;
    }
    public static void main(String[] args){
        IsArraySorted ias = new IsArraySorted();
        int[] arr = {1, 2, 9, 4, 5};
        boolean sorted = ias.isSorted(arr);
        if(sorted){
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }
}
