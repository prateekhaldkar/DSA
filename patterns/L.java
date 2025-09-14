// Input Format: N = 3
// Result: 
// 1
// 01
// 101

// Input Format: N = 6
// Result:   
// 1
// 01
// 101
// 0101
// 10101
// 010101

public class L {
    public static void main(String[] args) {
        int n=6;
    
         for( int i=1 ;i <=n  ; i++ ){
            for( int j=0; j<i ;j++ ){
                if ((i+j)%2 == 0) {
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
         }  
    } 
}