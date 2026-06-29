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
    public static String longestCommonPrefix(String[] str){

        String first_word = str[0];

        for(int i = 0; i<=first_word.length(); i++){
            for(int j = 1; j<=str.length; j++){
                if(i == str[j].length() || first_word.charAt(i) != str[j].charAt(j)){
                    return first_word.substring(0, i);
                }
            }
        }
        return first_word;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        //System.out.println(reverseString(s));
        //System.out.println(validPalindrome(s));
        System.out.println(longestCommonPrefix(str));

    }
}
