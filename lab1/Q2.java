import java.util.Scanner;
class Q2{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.println("Take size from user for array 1: ");
int n1=input.nextInt();
int arr1[]=new int[n1];
for(int i=0; i<n1; i++){
   System.out.print("Enter Value "+ i+ " ");
  arr1[i]=input.nextInt();
}
System.out.println("\n Array 1 ");
for(int i=0; i<n1; i++){
   System.out.print(arr1[i]+" ");
}
System.out.println("\nTake size from user for array 2: ");
int n2=input.nextInt();
int arr2[]=new int[n2];
for(int i=0; i<n2; i++){
   System.out.print("Enter Value "+ i+ " ");
  arr2[i]=input.nextInt();


}
System.out.println("\n Array 2 ");
for(int i=0; i<n2; i++){
   System.out.print(arr1[i]+" ");
}
int n3=n1+n2;
int arr3[]=new int[n3];
for(int i=0; i<n1; i++){
   arr3[i]=arr1[i];
}
for (int i=n1; i<n3; i++){
   arr3[i]=arr2[i-n1];
}
System.out.println("\nArray 3");
for(int i=0; i<n3; i++){
   System.out.print(arr3[i]+" ");
}
}
}

 
