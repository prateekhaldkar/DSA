// Given an integer N, return true it is an Armstrong number otherwise return false.

public class ArmstrongNumber {
    public static void main(String[] args) {
        int m = 153;
        int n = m;
        int count = 0;
        int answer = 0;
        int digit = 0;

        while (n != 0) {
            n = n/10;
            count++;
        }
        n = m;
        for(int i=1 ; i<=count ; i++ ){
            
            digit = n%10;
            for(int j=1 ; j<=count; j++){
                answer = answer + (digit * digit);
            }  

            n = n/10;
        }

        System.out.println(answer);
        // System.out.println(count);
    }
}