import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Snowflake extends Rectangle{
    public static final int SHAPEONE=1;
    public static final int SHAPETWO=2;
    public static final int SHAPETHREE=3;
    int x;
    int y;
    int sx;
    int sy;


    public Snowflake(int x, int y) {

        super(x, y, 200, 200);

        int sean;
        Random gen = new Random();
        sean = gen.nextInt(3) + 1;

        switch (sean) {
            case SHAPEONE:
                shapeOne(x, y);
                break;
            case SHAPETWO:
                shapeTwo(x, y);
                break;
            case SHAPETHREE:
                shapeThree(x, y);
                break;
        }

    }

    public void shapeOne(int x, int y){

        Color grt = new Color(1, 1, 1, 1);
        this.setBackground(grt);
        int count = 0;
        double angle = 0.0;
        x+=40;
        y+=40;


        while (count < 20) {
            Polygon ryan = new Polygon(x, y, 50, 3, angle, Color.decode("#ffffff"));
            this.add(ryan);
            angle += Math.PI / 5;
            count++;

        }

    }

    public void shapeTwo(int x, int y){

        Color grt = new Color(1, 1, 1, 1);
        this.setBackground(grt);
        int count = 0;
        double angle = 0.0;
        x+=90;
        y+=90;


        while (count < 10) {
            Polygon ryan = new Polygon(x, y, 50, 6, angle, Color.decode("#ffffff"));
            this.add(ryan);
            angle += Math.PI / 3;
            count++;

        }

    }

    public void shapeThree(int x, int y){

        Color grt = new Color(1, 1, 1, 1);
        this.setBackground(grt);
        int count = 0;
        double angle = 0.0;
        x+=40;
        y+=40;


        while (count < 20) {
            Polygon ryan = new Polygon(x, y, 20, 8, angle, Color.decode("#ffffff"));
            this.add(ryan);
            angle += Math.PI / 4;
            count++;

        }

    }

        public void move(){
        Random gen = new Random();
        x+=sx;
        y+=sy;
        }

        public static void main (String[]args){
          JFrame win = new JFrame("SNOWY");
          win.setBounds(30, 30, 500, 500);
          win.setLayout(null);
          win.setVisible(true);
          win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
          Rectangle blake = new Rectangle(0, 0, 1000, 1000);
          win.add(blake, 0);
          Snowflake snowy = new Snowflake(10, 10);
          Snowflake another = new Snowflake(210, 210);
          Snowflake anotheranother = new Snowflake(260, 260);
          win.add(snowy, 0);
          win.add(another, 0);
          win.add(anotheranother, 0);
          win.repaint();
     }
}