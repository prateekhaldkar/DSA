public class PalindromeNumber {
    public static void main(String[] args){
        int n = 124321;
        int num = n;
        int revnum = 0;

        while(num != 0){
            int digit = num % 10;
            revnum = revnum * 10 + digit;
            num = num/10;
        }

        System.out.println(n);
        System.out.println(revnum);
        if( n == revnum){
            System.out.println("This is a Palindrome Number");
        }else{
            System.out.println("This is not a Palindrome Number");
        }
        
    }   
}