package SlidingWindow;

public class Main {

    public static double findMaxAverage(int[] nums, int k) { // Fixed Window sliding Window pattern

        int curr_sum = 0;

        for (int i = 0; i < k; i++) { // First window
            curr_sum += nums[i];
        }

        int max_sum = curr_sum;

        int left = 0;

        for (int i = k; i < nums.length; i++) { // Slide the window
            curr_sum = curr_sum - nums[left] + nums[i];
            left++;
            max_sum = Math.max(max_sum, curr_sum);
        }

        return (double) max_sum / k;

    }

    public static boolean isVowel(char c) {
        return c == 'a' ||
                c == 'e' ||
                c == 'i' ||
                c == 'o' ||
                c == 'u';
    }

    public static int maxVowels(String s, int k) {

        int vowel_count = 0;

        for (int i = 0; i < k; i++) { // First Window

            if (isVowel(s.charAt(i))) {
                vowel_count++;
            }
        }

        int max_count = vowel_count;

        int left = 0;

        for (int i = k; i < s.length(); i++) { // Sliding Window

            if (isVowel(s.charAt(left))) { // leaving element
                vowel_count--;
            }

            if (isVowel(s.charAt(i))) { // incoming element
                vowel_count++;
            }

            left++;

            max_count = Math.max(max_count, vowel_count);
        }

        return max_count;
    }

    public static int minSubArrayLen(int target, int[] nums) { // Variable Sliding Window Pattern
        
        int left = 0;
        int sum = 0;
        int minlength = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){ //Lettcode:209

            sum += nums[right];

            while(sum >= target){

                minlength = Math.min(minlength, right - left + 1);

                sum -= nums[left];

                left++;
            }
        }
        if (minlength == Integer.MAX_VALUE) {
            return 0;
        }
        return minlength;
    }

    public static void main(String[] args) {

        int nums[] = { 2, 4, 5, 7, 8, 7, 6, 5, 4 };
        //System.out.println(findMaxAverage(nums, 3));
        //System.out.println(maxVowels("injamam", 4));
        System.out.println(minSubArrayLen(23, nums));
    }
}
