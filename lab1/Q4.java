import java.util.Scanner;
class Q4{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=input.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the array value");
		for(int i=0; i<n; i++){
			arr[i]=input.nextInt();
		}
           System.out.println("\nOriginal Array: ");
		for(int i=0; i<n; i++){
		System.out.print(arr[i]+" ");
		}

		int k=0;
		System.out.println("\nAfter duplicaty remove: ");
		for(int i=0; i<n; i++){
			int count=0;
			for(int j=i+1; j<n; j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count==0){
				System.out.print(arr[i]+" ");
				k++;
			}

			}
			System.out.println("\nOriginal size array: " +n);
			System.out.println("\nAfter duplicaty remove size: "+k);


	}
}