package Arrays;

public class Kandane{

    public static int maxSubarray(int [] arr){
        
        int currsum = arr[0];
        int maxsum = arr[0];

        for(int i = 1; i < arr.length; i++){
            
            currsum = Math.max(arr[i], currsum + arr[i]);
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    }

    public static int maxiumumProfit(int arr[]){

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] < minprice){
                minprice = arr[i];
            }
            int profit = arr[i] - minprice;

            if(profit > maxprofit){
                maxprofit = profit;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        
        int arr[] = {2,4, 5, 2};
        
        //System.out.println(maxSubarray(arr));

        System.out.println(maxiumumProfit(arr));
    }
}