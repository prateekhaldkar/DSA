// Input Format: N = 3
// Result: 
// 1
// 2 2 
// 3 3 3

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1 ; i<=n ; i++ ){
            for(int j=1 ; j<=i ; j++){
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
