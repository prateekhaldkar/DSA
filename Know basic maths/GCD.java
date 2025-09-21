// Given two integers N1 and N2, find their greatest common divisor.
import java.util.ArrayList;

public class GCD {
    public static void main(String[] args) {
        int n1 = 270;
        int n2 = 192;
        
        int big;

        ArrayList<Integer> arrn1 = new ArrayList<>();
        ArrayList<Integer> arrn2 = new ArrayList<>();

        int ans = 1;

        if( n1 >= n2){
            big = n1;
        }else{
            big = n2;
        }

        for(int i=1 ; i<=big ;i++ ){

            if(n1%i == 0){
                arrn1.add(i);
            }
            if( n2%i == 0 ){
                arrn2.add(i);
            }
        }

        System.out.println(arrn1);
        System.out.println(arrn2);
        outer:
        for( int i=arrn1.size()-1 ; i>=0 ;i-- ){
            for( int j=arrn2.size()-1 ; j>=0 ;j-- ){
                if( arrn1.get(i) == arrn2.get(j)){
                    ans = arrn1.get(i);
                    break outer;
                }
            }
        }       

        System.out.println(ans);
    }
}