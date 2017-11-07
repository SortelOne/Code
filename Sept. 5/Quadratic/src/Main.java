import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String aText = JOptionPane.showInputDialog(null, "ax^2+bx+c\nWhat is your a value?" , "Input" ,JOptionPane.QUESTION_MESSAGE);
        String bText = JOptionPane.showInputDialog(null, "ax^2+bx+c\nWhat is your b value?" , "Input" ,JOptionPane.QUESTION_MESSAGE);
        String cText = JOptionPane.showInputDialog(null, "ax^2+bx+c\nWhat is your c value?" , "Input" ,JOptionPane.QUESTION_MESSAGE);
        double xplus;
        double xminus;
        double xazero;
        int a = Integer.parseInt(aText);
        int b = Integer.parseInt(bText);
        int c = Integer.parseInt(cText);
        xplus =  (-b+Math.sqrt((b*b)-(4*a*c))/(2*a));
        xminus =  (-b-Math.sqrt((b*b)-(4*a*c))/(2*a));
        xazero = (-c/b);

        if (xplus<0 || xminus<0 || xazero<0)  {
            JFrame imaginewindow = new JFrame("Its Imaginary!");
            imaginewindow.setBounds(200, 50, 400, 250);
            imaginewindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel imagineanswer = new JLabel("It is Imaginary!");
            imaginewindow.add(imagineanswer, 0);
            imagineanswer.setText("Your answer is imaginary! It doesn't work!");
            imaginewindow.setVisible(true);
        }
        else if (a==0) {
            System.out.printf("%4.2f", xazero);
            JFrame window = new JFrame ("Quad Calculator");
            window.setBounds(200, 200, 700, 700);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel answer = new JLabel("Quadratic");
            window.add(answer, 0);
            answer.setText("The answer to your quadratic problem dealing with the numbers " + a + " and " + b + " and " + c + " is: " + xazero + ".");
            window.setVisible(true);
        }
        else {
            System.out.printf("%4.2f", xplus);
            System.out.printf("%4.2f", xminus);
            JFrame window = new JFrame ("Quad Calculator");
            window.setBounds(200, 200, 700, 700);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel answer = new JLabel("Quadratic");
            window.add(answer, 0);
            answer.setText("The answer to your quadratic problem dealing with the numbers " + a + " and " + b + " and " + c + " is: " + xplus + " and " + xminus + ".");
            window.setVisible(true);
        }

    }
}
