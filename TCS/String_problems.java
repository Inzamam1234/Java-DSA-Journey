package TCS;

import java.util.*;

public class String_problems {

    public static String reverseString(String s) {

        char[] charArray = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right]; //without using stringbuilder method
            charArray[right] = temp;

            left++;
            right--;
        }
        return new String(charArray);
    }

    public static boolean validPalindrome(String s){

        char[] arr = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(arr[left] != arr[right]){ 
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //System.out.println(reverseString(s));
        System.out.println(validPalindrome(s));

    }
}
