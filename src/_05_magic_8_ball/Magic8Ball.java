//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[]args) {
	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random ran = new Random();
int magic8ball = ran.nextInt(4);
	// 3. Print out this variable
JOptionPane.showInputDialog("Ask the magic 8 ball a question.");
	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0
if (magic8ball == 0) {
	JOptionPane.showMessageDialog(null, "Yes");
} else if (magic8ball == 1) {
	JOptionPane.showMessageDialog(null, "No");
} else if (magic8ball == 2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
} else if (magic8ball == 3) {
	JOptionPane.showMessageDialog(null, "Bettter not tell you now.");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
}
