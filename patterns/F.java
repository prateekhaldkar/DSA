// Input Format: N = 3
// Result: 
// 1 2 3
// 1 2
// 1


public class F {
    public static void main(String[] args) {
        int n = 3;

        for( int i=n ; i>0 ; i-- ){
            for( int j=1 ; j<=i ; j++ ){
                
                System.out.print(j +"  ");
            }
            System.out.println();
        }
    }
}
