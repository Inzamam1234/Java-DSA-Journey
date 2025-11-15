import java.util.Scanner;

public class Hello {

    public static int addition(int a,int b){
        return a+b;
    }
    public static int multi(int a,int b){
        return a*b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {

        /*System.out.println("HELLO World !!");
        System.out.println("✅ Java is working perfectly on Mac!");*/

        /* 
        Scanner sc = new Scanner(System.in);  //Defining a Scanner as sc
        System.out.println("Enter your name : ");
        String name = sc.nextLine(); //Getting input as string in sc 
        System.out.println("hello" +" "+ name + " "+"!!!!"); //Printing Output
        */

        
        Scanner sc = new Scanner(System.in);

        /* 
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        System.out.println("Addition: " + addition(a, b));
        System.out.println("Multiplication: " + multi(a, b));
        System.out.println("Subtraction: " + sub(a, b));
        */
        
        
        System.out.println("Enter your sweet name : ");
        String name = sc.nextLine();
        System.out.println("Enter your Age : ");
        int age = sc.nextInt();

        System.out.println("hello "+ name + ",you are "+ age + " years old !!");







    }
}
