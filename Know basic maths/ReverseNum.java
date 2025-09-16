public class ReverseNum {
    public static void main(String[] args) {
        int num = 1247654;
        System.out.println(revnum(num));

    }

    public static int revnum(int num){
        int revnum = 0;

        while( num != 0){
            int digit = num % 10;
            revnum = revnum * 10 + digit;
            num = num / 10;    
        }

        return revnum;
    }
}