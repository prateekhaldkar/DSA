// sadma
public class FindLargestElementinArray {
    public static void main(String[] args) {
        int[] arr = {18, 17, 13, 14, 15, 16};
        System.out.println("Largest Element is: " + findanswer(arr));
        
    }

    public static int findanswer(int[] aray ){

        int LargestElementinArray = aray[0];
        if(aray.length == 0){
            System.out.println("Array is empty: ");            
        }else{

            for( int i=0 ; i<aray.length-1 ; i++ ){
                if(LargestElementinArray < aray[i+1]){
                    LargestElementinArray = aray[i+1];
                }
            }
        }

        return LargestElementinArray;
    }
    
}