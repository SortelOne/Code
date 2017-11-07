import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Snowflake extends Rectangle{
    private static int sean;
    private static int x = 10;
    private static int y = 10;
    private static int s = 6;
    private static int a = 3;


    public Snowflake() {

        super(0, 0, 2000, 2000);

        Random gen = new Random();
        sean = gen.nextInt(3) + 1;


        switch (sean) {
            case 1:
                this.add(shapeOne());
                break;
            case 2:
                this.add(shapeTwo());
                break;
            case 3:
                this.add(shapeThree());
                break;
        }

    }

    public Snowflake shapeOne(){

        this.setBackground(Color.BLACK);
        int count = 0;
        double angle = 0.0;


        while (count < 20) {
            Polygon ryan = new Polygon(x, y, 50, s, angle, Color.decode("#ffffff"));
            this.add(ryan);
            angle += Math.PI / a;
            count++;

        }

        return Snowflake;

    }

    public Snowflake shapeTwo(){

        this.setBackground(Color.BLACK);
        int count = 0;
        double angle = 0.0;


        while (count < 20) {
            Polygon ryan = new Polygon(x, y, 50, s, angle, Color.decode("#ffffff"));
            this.add(ryan);
            angle += Math.PI / a;
            count++;

        }

        return Snowflake;

    }

    public Snowflake shapeThree(){

        this.setBackground(Color.BLACK);
        int count = 0;
        double angle = 0.0;


        while (count < 20) {
            Polygon ryan = new Polygon(x, y, 50, s, angle, Color.decode("#ffffff"));
            this.add(ryan);
            angle += Math.PI / a;
            count++;

        }

        return Snowflake;

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