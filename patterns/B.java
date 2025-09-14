// Input Format: N = 3
// Result: 
// * 
// * * 
// * * *
import java.util.Scanner;
public class B {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int n = scan.nextInt();

        for(int i = 1 ; i<=n ; i++ ){
            for( int j=1; j < i+1 ;j++ ){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}           