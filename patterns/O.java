// Input Format: N = 3
// Result: 
// A
// A B
// A B C

// Input Format: N = 6
// Result:   
// A
// A B
// A B C
// A B C D
// A B C D E
// A B C D E F

public class O {
    public static void main(String[] args) {
        int n = 6;

        for( int i = 1; i<=n ; i++ ){
            for(int j=1,p=65 ; j<=i ; j++,p++ ){
                System.out.print((char)p+" ");
            }
            System.out.println();
        }
    }
    
}
