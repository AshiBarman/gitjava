import java.util.Arrays;
public class Question13{
    public static void ZerosNegPos(int[] arr) {
        int[] newarr = new int[arr.length];
        int index=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                newarr[index++]=0;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                newarr[index++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                newarr[index++]=arr[i];
            }
        }
        System.out.println("new array is :"+Arrays.toString(newarr));
    }
    public static void main(String[] args) {
        int[] arr = {0,-1,2,0,-3,4,0,-1,6};
        ZerosNegPos(arr);
    }
}