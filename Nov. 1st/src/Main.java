import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Oval garrett;
        int x = 10;
        int y = 10;
        int count = 0;

        JFrame win = new JFrame("SNOWY");

        while (count < 3) {
            garrett = new Oval(x, y, 50, 50);
            y+=100;
            count++;
        }
    }
}
