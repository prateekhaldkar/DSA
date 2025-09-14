// Input Format: N = 3
// Result: 
// A
// B B
// C C C

// Input Format: N = 6
// Result:   
// A 
// B B
// C C C
// D D D D
// E E E E E
// F F F F F F

// finally solved in onece 
public class Q {
    public static void main(String[] args) {
        int n= 6;

        for( int i=1, al=65 ; i<=n ; i++, al++){
            for(int j=1 ; j<=i ; j++ ){
                System.out.print((char)al+" ");
            }
            System.out.println();
        }
    }
}
