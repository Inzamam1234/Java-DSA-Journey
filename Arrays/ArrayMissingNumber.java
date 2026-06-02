package Arrays;

public class ArrayMissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arraySum = 0;

        for (int num : nums) {
            arraySum += num; // Sum of elements in the array
        }

        return totalSum - arraySum; // The missing number is the difference
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 4, 5 }; // Example array with a missing number
        int missing = missingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }
}
