package Searching;

public class BinarySearch {

    public static int search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){

            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {

        int arr[] = {3,4,5,6,7,8};

        System.out.println(search(arr, 3));
        System.out.println(searchInsert(arr, 9));
        
    }
}
