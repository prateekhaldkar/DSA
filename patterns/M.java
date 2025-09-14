// Input Format: N = 3
// Result: 
// 1    1
// 12  21
// 123321

// Input Format: N = 6
// Result:   
// 1          1
// 12        21
// 123      321
// 1234    4321
// 12345  54321
// 123456654321

public class M {
    public static void main(String[] args) {
        int n=6 ;
        int space = n*2-2;
        
        for( int i=1; i<=n ; i++ ){
            
            for( int j=1 ; j<=i ;j++ ){
                System.out.print(j);
            }
            for(int j=1 ; j<=space ; j++){
                System.out.print(" ");
            }
            for( int j=i; j>=1 ;j-- ){
                System.out.print(j);
            }

            System.out.println();

            space = space-2;

        }
    }
}
