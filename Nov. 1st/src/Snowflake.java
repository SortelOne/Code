import javax.swing.*;
import java.awt.*;


public class Snowflake extends Rectangle{


    public Snowflake(){
        super(10, 10, 500, 500);

        this.setBackground(Color.BLACK);
        int x = 200;
        int y = 200;
        int count = 0;
        double angle = 0.0;


        while (count < 15) {
            Polygon ryan = new Polygon(x, y, 50, 5, angle, Color.decode("#ffffff"));
            this.add(ryan);
            ryan.setVisible(true);
            angle+=Math.PI/6;
            count++;
        }
    }

    public static void main (String[]args){
        JFrame win = new JFrame("SNOWY");
        win.setBounds(30, 30, 500, 500);
        win.setLayout(null);
        win.setVisible(true);
        win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
        Rectangle blake = new Rectangle(0, 0, 1000, 1000);
        win.add(blake, 0);
        Snowflake s1 = new Snowflake();
        win.add(s1, 0);
        win.repaint();
    }


}