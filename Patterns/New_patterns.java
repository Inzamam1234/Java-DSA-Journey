package Patterns;

import java.util.*;

public class New_patterns {

    public static void squarePattern(int n){                          
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void DynamicTriangle(int n){
        
        for(int i = 0; i < n; i++){
			
			System.out.print("* ");

			if(i > 0){
				System.out.print((char)('A'+ i - 1) + " ");
				for(int j = 0; j < i; j++){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
    }
    public static void Z_shaped(int n) {
        for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == 0 || i == n - 1){
					System.out.print("# ");
				}
				else if(j == n - i - 1){
					System.out.print("# ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        squarePattern(n);
        System.out.println();
        DynamicTriangle(n);
        System.out.println();
        Z_shaped(n);
    }
}
