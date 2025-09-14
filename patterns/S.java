// Input Format: N = 3
// Result: 
// C
// B C
// A B C

// Input Format: N = 6
// Result:   
// F
// E F
// D E F
// C D E F
// B C D E F
// A B C D E F
public class S {
    public static void main(String[] args) {
        
        int n=6;

        for( int i=n; i>=1 ; i-- ){
            
            for( int j=i ; j<=n ; j++){
                System.out.print((char)('A'+j-1)+" ");
            }
            System.out.println();
        }
    }
}
