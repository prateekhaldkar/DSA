public class ArraySortedOrNot {
 
    public static void main(String[] args) {
        int[] arr = {5, 9, 8, 12, 21, 23, 34};
        
        System.out.println(ason(arr));
    }

    static boolean ason(int[] aray){
        boolean answer = false;

        for( int i=0 ; i<aray.length-1 ; i++){
            if( aray[i] <= aray[i+1] ){
                answer = true;
            }else if(aray[i] > aray[i+1]){
                break;
            }
        }
        return answer;
    } 
}