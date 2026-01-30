import java.util.Scanner;
class Pattern {

    public void pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    
    public void pattern2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0;j <= i; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    
    public void pattern3(int n){
        for(int i = 1; i < n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
        System.out.println();
        }
    }

    public void pattern4(int n){
        for(int i = 1; i < n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
        System.out.println();
        }
    }

    public void pattern5(int n){
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n-i+1; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    
    public void pattern6(int n){
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n-i+1; j++){
                System.out.print(j);
            }
        System.out.println();
        }
    }
    
    public void pattern7(int n){
        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0;j < 2*i+1; j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern8(int n){
        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0;j < 2*n - (2*i+1); j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    


    public static void main (String[]args){

    Pattern sol = new Pattern();

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the No.of.rows of Stars to be Printed : ");
    int n = sc.nextInt();

    System.out.println();

    sol.pattern8(n);
    }

}