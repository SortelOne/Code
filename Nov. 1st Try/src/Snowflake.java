import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Snowflake extends Rectangle{
    private static int sean;


    public Snowflake() {

        super(0, 0, 2000, 2000);



        Random gen = new Random();
        sean = gen.nextInt(3) + 1;


        switch (sean) {
            case 1:
                shapeOne();
                break;
            case 2:
                shapeTwo();
                break;
            case 3:
                shapeThree();
                break;
        }

    }

    public void shapeOne(){

        this.setBackground(Color.BLACK);
        int count = 0;
        double angle = 0.0;


        while (count < 20) {
            Polygon ryan = new Polygon(300, 100, 50, 3, angle, Color.decode("#ffffff"));
            this.add(ryan);
            angle += Math.PI / 5;
            count++;

        }

    }

    public void shapeTwo(){

        this.setBackground(Color.BLACK);
        int count = 0;
        double angle = 0.0;


        while (count < 20) {
            Polygon ryan = new Polygon(200, 100, 50, 6, angle, Color.decode("#ffffff"));
            this.add(ryan);
            angle += Math.PI / 3;
            count++;

        }

    }

    public void shapeThree(){

        this.setBackground(Color.BLACK);
        int count = 0;
        double angle = 0.0;


        while (count < 20) {
            Polygon ryan = new Polygon(100, 100, 20, 8, angle, Color.decode("#ffffff"));
            this.add(ryan);
            angle += Math.PI / 4;
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
          Snowflake snowy = new Snowflake();
          win.add(snowy, 0);
          win.repaint();
     }
}