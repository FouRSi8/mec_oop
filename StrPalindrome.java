import java.util.*;
public class StrPalindrome {
	public static void main(String args[]){
		Scanner keyIn = new Scanner(System.in);
	
		System.out.println("Enter a string: ");
		String string = keyIn.nextLine();
	
		String reverse = "";
	
		for(int i=string.length()-1;i >= 0;i--){
			reverse = reverse + string.charAt(i);
		}

		if(string.compareTo(reverse) == 0){
			System.out.println("The string "+string+" is a palindrome");		
		}

		else{
                         System.out.println("The string "+string+" is a not a palindrome");				
		}
	}
}
