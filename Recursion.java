public class Recursion { //

    public int factorial(int n){
        if(n == 0){ //if n =1 --> 1! = 1 (Base case)
            return 1;       
        }
        return n * factorial(n-1);  // if n = 6 ---> 6 * 5!....
    }

    public int fibonacci(int n){
        if(n <= 1){
            return n;  // basecase - starts from 0,1 
        }
        return fibonacci(n-1) + fibonacci(n-2); // ex : if fib(2) --> fib(1) + fib(0) = 1 + 0 = 1
    }

    public int power(int x, int n){
       if(n == 0){
        return 1; // 2^0 = 1 (basecase)
       }
       return x * power(x, n-1); // if x = 2 and n = 5....1st --> 2*power(2,4)....2nd --> 2*power(2,3)....at the end 2*2*2*2*2*1 = 32 
    }

    public int sumofdigits(int n){
        if(n == 0){ // base case 
            return 0;
        }
        return (n%10) + sumofdigits(n/10); //(n%10) extract last digit and (n/10) removes the last element and the func calls again
    }
    public static void main(String[] args) {

        Recursion obj = new Recursion();

        //System.out.println(obj.factorial(0));
        //System.out.println(obj.fibonacci(6));
        //System.out.println(obj.power(2, 5));
        System.out.println(obj.sumofdigits(12345));
    }
}
