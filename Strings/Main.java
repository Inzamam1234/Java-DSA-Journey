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
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
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
        System.out.println(removeWhitespaces(str));
        
    }
}
