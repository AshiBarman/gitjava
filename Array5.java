import java.util.Scanner;
public class Array5 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of  array");   
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element");
        for(int i=0;i<n;i++){
        arr[i]= in.nextInt();
        
        }
        int max = arr[0];
        int min = arr[0];
    for(int i =1;i<n;i++){
        if(arr[i]>max){
            max =  arr[i];
        }
    }
    for(int i =1;i<n;i++){
        if(arr[i]<min){
            min =  arr[i];
        }
    }
        System.out.println("Maximum element:"+ max);
        System.out.println("Minimum number"+min);
    }
}
            