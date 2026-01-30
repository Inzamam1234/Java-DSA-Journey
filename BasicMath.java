import java.util.Scanner;

public class BasicMath {

    public boolean isPalindrome(int x) {
        
        if(x < 0)return false;

        int original = x;
        int reverse = 0;  

        while(x > 0){
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return reverse == original;
    }
    public int reversenum(int x){
        int rev = 0;
        while(x > 0){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return rev;
    }
    public int countdigits(int x){

        int count = 0;
        while(x > 0){
            count++;
            x = x / 10;
        }
        return count;
    }
    public String armstringnum(int x){
        int original = x;
        int sum = 0;

        while(x > 0){
            int digit = x % 10;
            sum = sum + (digit * digit * digit);
            x = x / 10;
        }
        if(original == sum){
            return "Armstring Number";
        }
        else return "Not An Armstring Number";

    }
    public int gcd(int a, int b){

        while (b != 0){
            int remainder = a % b; // eg: a=10 & b=2 ---> 10%2=0 ---> a=2 and b=0
            a = b;
            b = remainder;
        }
        return a; // b becomes 0 and a is the gcd
    }

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        BasicMath obj = new BasicMath();   // object creation

        //System.out.println(obj.isPalindrome(x));
        //System.out.println(obj.reversenum(x));
        //System.out.println(obj.countdigits(x));
        //System.out.println(obj.armstringnum(x));
        System.out.println(obj.gcd(x, y));

    }
  }
