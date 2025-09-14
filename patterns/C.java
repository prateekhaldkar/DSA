// Input Format: N = 3
// Result: 
// 1
// 1 2 
// 1 2 3

import java.util.Scanner;
public class C {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a value :");
        int n = scan.nextInt();

        for(int i=1 ; i<=n ; i++ ){
            for(int j=1 ; j<i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}
