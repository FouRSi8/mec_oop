import java.util.Scanner;
public class Zero{
	public static void main(String args[]){
			
		int n,sum = 0;

		Scanner keyIn = new Scanner(System.in);
		

		do{
			System.out.println("Enter an integer:");
			n= keyIn.nextInt();
			sum = sum + n;
		  }
		while(n!=0);
		
		System.out.println("The sum is "+sum);
	
	}
}
		
			
