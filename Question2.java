import java.util.Scanner;
public class Question2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Reversed array:");
        for(int i=n-1;i>0;i--){
            System.out.println(arr[i]+"");
        }
    }
}
