package _14_rollercoaster;
import javax.swing.JOptionPane;


public class rollarcoaster {
	public static void main(String[] args) {
String height = JOptionPane.showInputDialog("What is your height?");
int num = Integer.parseInt(height);
if (num>48) {
	JOptionPane.showMessageDialog(null, "You can go on the rollar coaster.");
}else if (num<48) {
	JOptionPane.showMessageDialog(null, "Grow taller kid.");
}
		
}
}
