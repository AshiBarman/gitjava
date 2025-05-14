import java.util.Scanner;
class Question3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = in.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter Element");
        for(int i = 0;i<n;i++){
            arr [i] =in.nextInt();
        }
        System.out.println("Enter Kth Element");
        int K = in.nextInt();
        if(K<=0||K>n){
            System.out.println("invalid input");
        }
        int Kthmax = arr[n-K];
        int Kthmin = arr[K-1];
        for(int i =1;i<n;i++){
            if(arr[i]>Kthmax){
                Kthmax=arr[i];
            }
        }
        for(int i=1;i<n;i++){
            if(arr[i]<Kthmin){
                Kthmin=arr[i];
            }
        }
        System.out.println("Maximum Kth element"+Kthmax);
        System.out.println("Minimum Kth element"+Kthmin);
    }
}
