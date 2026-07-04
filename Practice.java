import java.util.*;

class Main {
    public static boolean IsPalindrome(int n) {
        int original = n;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev == original;
    }

    public static int CountDigits(int n) {
        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            count = count + 1;
            n = n / 10;
        }
        return count;
    }

    public static String ArmStringNumber(int n) {
        int original = n;
        int count = 0;

        while (n != 0) {
            int digit = n % 10;
            count = count + 1;
            n = n / 10;
        }

        int sum = 0;
        n = original;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + (int) Math.pow(digit, count);
            n = n / 10;
        }

        if (original == sum) {
            return "Armstrong Number !";
        } else {
            return "Not Anrmstrong number !";
        }

    }

    public static int smallestNumber(int arr[]){

        Arrays.sort(arr);
        return arr[0];
    }

    public static int largestNumber(int arr[]){

        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static String SecondSmallestLargest(int arr[]){

        Arrays.sort(arr);

        int smallest = arr[0];
        int second_smallest = Integer.MAX_VALUE;

        int largest = arr[arr.length-1];
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != smallest){
                second_smallest = arr[i];
                break;
            }
        }
        for(int i = arr.length-1; i >= 0 ; i--){
            if(arr[i] != largest){
                secondLargest = arr[i];
                break;
            }
        }
        return "Second Largest : " + secondLargest + "\n" + "Second Smallest : "+second_smallest;
    }

    public static String SumAndAvgOfAnArray(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        int avg = sum / arr.length;
        return "Sum of an array : " + sum + "\n" +"Average of the array : "+ avg;
    }
    
    public static int LinearSearch(int arr[], int target){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    } 

    public static String ReverseArray(int arr[]){
        int left = 0;
        int right = arr.length -1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return Arrays.toString(arr);
    }

    public static void FrequencyCountOfElements(int arr[]){

        boolean visited[] = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(visited[i]){
                continue;
            }
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    
                    if(i != j){
                        visited[j] = true;
                    }
                }
            }
            System.out.println(arr[i] + "-->" + count);
        }

    }

    public static int RemoveDuplicateInSortedArray(int arr[]){

        int i = 0;
        for(int j = 1; j < arr.length; j++){ //two pointer method
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    public static int removeDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int index = 0;
        for(int num : arr){
            if(!set.contains(num)){ //hashset method
                set.add(num);
                arr[index] = num;
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

        //int n = sc.nextInt();
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        //System.out.println("Target index : "+ LinearSearch(arr, 2));
        /* 
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        */
        
        //System.out.println(smallestNumber(arr));
        //System.out.println(largestNumber(arr));
        //System.out.println(SecondSmallestLargest(arr));
        //System.out.println(IsPalindrome(n));
        //System.out.println(CountDigits(n));
        //System.out.println(ArmStringNumber(n));
        //System.out.println(SumAndAvgOfAnArray(arr));
        //System.out.println(ReverseArray(arr));
        //FrequencyCountOfElements(arr);
        //System.out.println(RemoveDuplicateInSortedArray(arr));
        int k = removeDuplicates(arr);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}




 