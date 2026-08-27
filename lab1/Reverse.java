import java.util.Scanner;
class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Take Size from user");

        int n=sc.nextInt();
        int arr[]=new int [n];
        
        System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(" Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int arr2 []=new int [n];
          
          for(int i=0; i<n; i++){
            arr2[i]=arr[i];
          }
          System.out.print("\nReverse Copy Array: ");
          for(int i=arr2.length-1; i>=0; i--){
            System.out.print(arr2[i]+" ");
          }
    }
}