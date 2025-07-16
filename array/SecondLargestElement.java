import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args){
        // int[] arr = {10, 20, 30, 25, 15};
        // int[] arr = {15, 15, 15, 15};
        // int[] arr = {42};
        // int[] arr = {100, 90, 80, 70};
        // int[] arr = {10, -1, -5, -10};
        // int[] arr = {-10, -30, -20, -40};
        int[] arr = {99, 100, 10};


        System.out.println(findanswer2(arr));
        
        // findanswer2(arr);

    }    

    static int findanswer2(int[] aray){

        int ans = -1;
        if( aray.length == 0){
            System.out.println("Array is Empty !");
        }else if (aray.length != 1){
            Arrays.sort(aray);
            if( aray[aray.length-1] != aray[aray.length-2]){
                ans = aray[aray.length-2];
            }else{
                ans = aray[aray.length-2];
                System.out.println("two largest elements are equal: "+ aray[aray.length-2]);
            }
        }else if(aray.length == 1){
            System.out.println("There is only one element: " + aray[0]);
        }
        return ans;
    }
}
