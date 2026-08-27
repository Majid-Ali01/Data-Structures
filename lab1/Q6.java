import java.util.Scanner;
class Q6{
	public static void main(String args[]){
		Scanner input=new Scanner (System.in);
		System.out.print("Enter size of cloumn array: ");
		int n=input.nextInt();
		System.out.print("Enter size of row array: ");
		int m=input.nextInt();
		int arr [][]=new int [m][n];
		System.out.println("Enter the array Value: ");
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=input.nextInt();
			}
		} 
		      System.out.println("Array values are: ");
			for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		int sum1=0;
		for (int j=0; j<n; j++){
			sum1+=arr[0][j];
		}
		boolean rowMagic =true;
		for(int i=0; i<m; i++){
			int sum=0;
			for(int j=0; j<n; j++){
				sum+=arr[i][j];
			}
			if(sum!=sum1){
				rowMagic=false;
				break;
			}
		}
		if(rowMagic){
			System.out.println("Row Magic");
		}
		else{
			System.out.println("Not Row Magic");
		}

	}
}