// Input Format: N = 3
// Result: 
// A B C
// A B
// A

// Input Format: N = 6
// Result:   
// A B C D E F
// A B C D E 
// A B C D
// A B C
// A B
// A
public class P {
    public static void main(String[] args) {
        int n = 6;

        for( int i=n ; i>0 ; i-- ){
            for( int j=1,num=65 ; j<=i  ; j++, num++ ){
                System.out.print((char)num + " ");     
            }
            System.out.println();
        }
    }
}
