import java.util.Scanner;
public class Palindrome{
	public static void main(String args[]){
		
		int rem, sum=0, temp;
		Scanner keyIn = new Scanner(System.in);
		
		//Getting Input		
		System.out.println("Enter a number:");
		int n = keyIn.nextInt();

		temp = n;
		
		while(n>0){
			rem = n%10;
			sum = (sum*10)+rem;
			n = n/10;
		}
		
		//Output
		if(temp == sum){
		System.out.println("Input is "+temp);
		System.out.println("Output is "+sum+" \nIts a Palindrome");
		}

		else{
		System.out.println("Input is "+temp);
		System.out.println("Output is "+sum+" \nIt aint a Palindrome");		
		}	
	}
}
			

					
		
	
