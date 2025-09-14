// Input Format: N = 3
// Result: 
//   *  
//   **
//   ***  
//   **
//   *

// Input Format: N = 5
// Result: 
//   *
//   **
//   ***
//   ****
//   *****
//   ****
//   ***
//   **
//   *


public class J {
    public static void main(String[] args) {
        int n=5;
        
        for(int i=1 ; i<=n ; i++){
            for(int j=0  ; j<i ;  j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for( int k=1 ; k<n ;k++  ){
            for( int l=0 ; l<n-k ; l++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
