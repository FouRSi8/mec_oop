import javax.swing.JOptionPane;
public class Test{
	public static void main(String args[]){
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null,"Your name is "+name);		
	}
}
