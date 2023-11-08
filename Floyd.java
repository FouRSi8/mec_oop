import java.util.Scanner;
public class Floyd{
	public static void main(String args[]){
		
		int n,i,j,k=1;
		Scanner keyIn = new Scanner(System.in);		
		System.out.println("Enter number of rows:");
		n = keyIn.nextInt();

		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(""+k+++" ");
			}
		System.out.println();}
	}
}
					
