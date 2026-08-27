import java.util.Scanner;
class Q3{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=input.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the array value");
		for(int i=0; i<n; i++){
			arr[i]=input.nextInt();
		}
         System.out.println("\n Array Value: ");
		for(int i=0; i<n; i++){
		System.out.print(arr[i]+" ");}
		int count=0;
		for(int i=0; i<n; i++){
			
			for(int j=i+1; j<n; j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			
			}
			if(count>0){
				System.out.println("\nThe count of duplicate values is:" +count);
			}

	}
}