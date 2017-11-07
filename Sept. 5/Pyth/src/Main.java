import javax.swing.*;


public class Main {

    public static void main(String[] args) {
	String aText = JOptionPane.showInputDialog(null, "Enter a value for a: " , "Input" ,JOptionPane.QUESTION_MESSAGE);
	String bText = JOptionPane.showInputDialog(null, "Enter a value for b: " , "Input" ,JOptionPane.QUESTION_MESSAGE);
	int a = Integer.parseInt(aText);
	int b = Integer.parseInt(bText);
	double c = Math.sqrt(a*a + b*b);
	System.out.printf("%4.2f", c);
	JFrame win = new JFrame("MATH");
	win.setBounds(100, 50, 300, 200);
	win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel answer = new JLabel("Hypotenuse");
	win.add(answer, 0);
	answer.setText("The Numbers " + a + " and " + b + " to the thingy to be:" + c);
	win.setVisible(true);
    }
}
