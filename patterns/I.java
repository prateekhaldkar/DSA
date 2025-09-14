// Input Format: N = 3
// Result: 
//   *  
//  ***
// ***** 
// *****  
//  ***
//   * 


// Input Format: N = 3
// Result: 
//     *  
//    ***
//   ***** 
//  *******  
// *********
// *********
//  *******
//   *****
//    ***
//     *


public class I {
    public static void main(String[] args) {
        int n = 3;
        for(int i=0 ; i<=n ;i++ ){
            
            for(int j=0 ; j<n-i ; j++){
                System.out.print(" ");
            }

            for( int k=0 ; k<(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for( int l=0 ; l<n ; l++){
            for( int m=0 ; m<l ; m++ ){
                System.out.print(" ");
            }

            for(int o=0 ; o<(2*(n-l)-1) ; o++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
