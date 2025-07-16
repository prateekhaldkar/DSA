import java.util.Vector;
import java.util.Stack;
class NextLargeElement{
    public static void main(String[] args) {
        int arr[] = {1,3,2,4};
        int size = arr.length;
        Vector<Integer> v = new Vector<>();
        Stack<Integer> s = new Stack<>();
        

        for(int i=size-1; i>=0 ; i--){
            if(s.size()==0){
                v.add(-1); 
            }else if(s.size()>0 && s.peek()>arr[i]){
                
            }
        }

    }
}