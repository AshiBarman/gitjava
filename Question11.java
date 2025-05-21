import java.util.Arrays;

public class Question11 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // int n = arr.length;
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        // arr[0]=n;
        arr[0]=arr.length;
        System.out.println("new array is:"+Arrays.toString(arr));
        

    }
}

