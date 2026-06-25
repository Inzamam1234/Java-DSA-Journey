package BasicMath;
import java.util.Scanner;

public class Datatypes {

    public static double radius(int r) {
        double area = 3.14 * r * r;
        return area;
    }

    public static void main(String[] args) {
        
        // Area of a circle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        int r = sc.nextInt();
        System.out.println("Area of the Circle is : " + radius(r));

        // Swap two number (without third variable)

        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();

        System.out.println("Enter b : ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("AFTER SWAPPING : " );
        System.out.println("A :"+ a);
        System.out.println("B :"+ b);
        */

    }
}
