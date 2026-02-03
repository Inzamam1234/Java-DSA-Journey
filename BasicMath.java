import java.util.Scanner;

public class BasicMath {

    public boolean isPalindrome(int x) {

        if (x < 0)
            return false;

        int original = x;
        int reverse = 0;

        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return reverse == original;
    }

    public int reversenum(int x) {
        int rev = 0;
        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return rev;
    }

    public int countdigits(int x) {

        int count = 0;
        while (x > 0) {
            count++;
            x = x / 10;
        }
        return count;
    }

    public String armstringnum(int x) {
        int original = x;
        int sum = 0;

        while (x > 0) {
            int digit = x % 10;
            sum = sum + (digit * digit * digit);
            x = x / 10;
        }
        if (original == sum) {
            return "Armstring Number";
        } else
            return "Not An Armstring Number";

    }

    public int gcd(int a, int b) {

        while (b != 0) {
            int remainder = a % b; // eg: a=10 & b=2 ---> 10%2=0 ---> a=2 and b=0
            a = b;
            b = remainder;
        }
        return a; // b becomes 0 and a is the gcd
    }

    public boolean isprime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1)
            return false;

        // Check divisibility from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {

            // If n is divisible by i, it is not prime
            if (n % i == 0) {
                return false;
            }
        }
        // If no divisor is found, n is prime
        return true;
    }

    public static void FactorsOfNum(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
            if (i != n / i) {
                System.out.println(n / i);
            }
        }
    }

    public int sumofdigits(int n) {

        int sum = 0;

        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;

    }

    public static int productofdigit(int n) {

        int product = 1;

        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }
        return product;
    }

    public static void EvenOddCount(int n) {
        int odd = 0;
        int even = 0;

        while (n > 0) {
            if (n % 2 == 0)
                even++;
            else
                odd++;

            n = n / 10;
        }
        System.out.println("Odd Number :" + odd);
        System.out.println("Even Number :" + even);

    }

    public int PowerOfNumber(int base, int exp) {

        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return result;
    }

    public boolean PerfectNumber(int n) {

        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum == n;
    }

    public static void FibonacciSeries(int n){
        int a = 0;
        int b = 1;

       // Handle small cases
        if (n == 1) {
          System.out.print(0);
          return;
    }

       // Print first two Fibonacci numbers
        System.out.print(a + " " + b + " ");

        // Generate remaining numbers
        for(int i = 2; i < n; i++){
            int c = a + b;
            System.out.print(c +" ");

            a = b;
            b = c;
        }

    }
    
    public static boolean IsPowerOfTwo(int n){

        if(n <= 0) return false; //Power of 2 must be positive

        while(n % 2 == 0){ // Keep dividing by 2
            n = n / 2;
        }
        return n == 1; 
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // System.out.print("Enter the digits to multipile : ");
        int n = sc.nextInt();
        //System.out.print("Enter the base number : ");
        //int base = sc.nextInt();
        //System.out.print("Enter the Power number for the base : ");
        //int exp = sc.nextInt();

        BasicMath obj = new BasicMath(); // object creation

        // System.out.println(obj.isPalindrome(x));
        // System.out.println(obj.reversenum(x));
        // System.out.println(obj.countdigits(x));
        // System.out.println(obj.armstringnum(x));
        // System.out.println(obj.gcd(x, y));
        // System.out.println(obj.isprime(n));
        // FactorsOfNum(n);
        // System.out.println(obj.sumofdigits(n));
        // System.out.println("Product of Digits : "+ productofdigit(n));
        // EvenOddCount(n);
        //int answer = obj.PowerOfNumber(base, exp);
        //System.out.println("Power of Number is : " + answer);
        //System.out.println(obj.PerfectNumber(n));
        //FibonacciSeries(n);
        System.out.println(obj.IsPowerOfTwo(n));
    }
}
