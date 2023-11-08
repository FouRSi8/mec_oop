import java.util.*;
public class StrReverse{
	public static void main(String args[]){
		Scanner keyIn = new Scanner(System.in);
	
		System.out.println("Enter a string: ");
		String string = keyIn.nextLine();
	
		String reverse = "";

		System.out.println("The reversed String is: ");
	
		for(int i=string.length()-1;i >= 0;i--){
			reverse = reverse + string.charAt(i);
		}

		System.out.println(reverse);
	}
}	
