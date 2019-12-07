package _15_voting_booth;
import javax.swing.JOptionPane;
public class votingbooth {
public static void main(String[]args) {
	String age = JOptionPane.showInputDialog("What is your age?");
	int num = Integer.parseInt(age);
	if (num>18) {
		String president = JOptionPane.showInputDialog("Who should the next president be?");
		JOptionPane.showMessageDialog(null, "Oh cool I want " + president + " to be president too.");
	}else if (num<18) {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
	} 
	
	
	
}
}
