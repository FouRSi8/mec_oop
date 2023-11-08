import java.util.*;
public class Frequency {
	public static void main(String args[]){
		Scanner keyIn = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string = keyIn.nextLine();
		
		System.out.println("Enter a character to search: ");
		char character  = keyIn.nextLine().charAt(0);
		int count = 0;

		for(int i=0;i<string.length();i++){
			if(character == string.charAt(i)){
				count++;
			}
		}
	
		System.out.println("The total frequency of the character "+character+" is "+count);
		
	}
}
