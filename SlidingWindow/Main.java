package SlidingWindow;

public class Main {

    public static double findMaxAverage(int[] nums, int k) { // Fixed Window sliding Window pattern

        int curr_sum = 0;
        
        for(int i = 0; i < k; i++){  // First window
            curr_sum += nums[i];
        }

        int max_sum = curr_sum;

        int left = 0;

        for(int i = k; i < nums.length; i++){ // Slide the window
            curr_sum = curr_sum - nums[left] + nums[i];
            left++;
            max_sum = Math.max(max_sum, curr_sum);
        }

        return (double) max_sum / k;

    }
    public static void main(String[] args) {
        
        int nums[] = {2,4,5,7,8,7,6,5,4};
        System.out.println(findMaxAverage(nums, 3));
    }
}
