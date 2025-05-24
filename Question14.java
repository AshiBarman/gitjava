public class Question14 {
    public static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;
            }
        }
        return count == 1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,8,6,1};
        System.out.println(isSortedAndRotated(arr1));
        System.out.println(isSortedAndRotated(arr2));
    }
}
