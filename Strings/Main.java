package Strings;
import java.util.*;
public class Main {

    public static boolean IsVowels(char ch){

            ch = Character.toLowerCase(ch);
            return ch == 'a' || ch == 'u' || ch == 'o' || ch == 'i' || ch == 'e';
    }

    public static String removeWhitespaces(String str){
        
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            // If the character is not a space, tab, or newline
            if (c != ' ' && c != '\t' && c != '\n') {
                // Append it to the result
                result.append(c);
            }
        }
        return result.toString();
    }

    public static boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        HashMap <Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : t.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for(int freq : map.values()){
            if(freq != 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s) { //Leetcode Problem
        
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            else{

                char l = Character.toLowerCase(s.charAt(left));
                char r = Character.toLowerCase(s.charAt(right));

                if(l != r){
                    return false;
                }

                left++;
                right--;
            }
        }
        return true;
    }

    public static int firstUniqChar(String s) {
        
        HashMap <Character, Integer> map = new HashMap<>();

        // Pass 1: Count frequencies
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Pass 2: Find first unique character
        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if(map.get(ch) == 1){
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //String t = sc.nextLine();
        /* 
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);
            if(!IsVowels(ch)){
                ans.append(ch);
            }
        }
        System.out.println(ans);
        */
        //System.out.println(removeWhitespaces(str));

        //System.out.println(isAnagram(s, t));

        //System.out.println(isPalindrome(s));

        System.out.println(firstUniqChar(s));
        
    }
}
