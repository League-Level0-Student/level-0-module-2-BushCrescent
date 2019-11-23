package _06_lottery_numbers;
import javax.swing.JOptionPane;
import java.util.Random;
public class lotteryticket {
	public static void main(String[]args) {
	Random ran = new Random();
	int number1 = ran.nextInt(10);
	int number2 = ran.nextInt(10);
	int number3 = ran.nextInt(10);
	int number4 = ran.nextInt(10);
	int number5 = ran.nextInt(10);
	JOptionPane.showMessageDialog(null, number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5);
}
}