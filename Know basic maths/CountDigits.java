public class CountDigits{
    public static void main(String[] args) {
        int n = 626434720;
        
        
        digitcounter(n);

    }   
    
    public static int digitcounter(int  i){
        
        int count = 0;

        while (i != 0) {
            i = i/10;
            count++;
        }

        System.out.println(count);

        return 0;
    }
}