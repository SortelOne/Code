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
                shapeOne();
                break;
            case SHAPETWO:
                shapeTwo();
                break;
            case SHAPETHREE:
                shapeThree();
                break;
        }

    }

    public void shapeOne(){

        Color grt = new Color(1, 1, 1, 1);
        this.setBackground(grt);
        int count = 0;
        double angle = 0.0;

        while (count < 20) {
            Polygon ryan = new Polygon(100, 100, 20, 3, angle, Color.decode("#ffffff"));
            this.add(ryan);
            angle += Math.PI / 5;
            count++;

        }

    }

    public void shapeTwo(){

        Color grt = new Color(1, 1, 1, 1);
        this.setBackground(grt);
        int count = 0;
        double angle = 0.0;


        while (count < 10) {
            Polygon ryan = new Polygon(100, 100, 20, 6, angle, Color.decode("#ffffff"));
            this.add(ryan);
            angle += Math.PI / 3;
            count++;

        }

    }

    public void shapeThree(){

        Color grt = new Color(1, 1, 1, 1);
        this.setBackground(grt);
        int count = 0;
        double angle = 0.0;


        while (count < 20) {
            Polygon ryan = new Polygon(100, 100, 10, 8, angle, Color.decode("#ffffff"));
            this.add(ryan);
            angle += Math.PI / 4;
            count++;

        }

    }

        public void move(int l){
        Random gen = new Random();

        sy = gen.nextInt(4)+1;
        sx = gen.nextInt(2)+1;

        x=this.getX();
        y=this.getY();

        x+=sx;
        y+=sy;

        if(y>=1000){
           y=0;
           int laing = gen.nextInt();
           x=laing;
        }

        this.setLocation(x+sx, y+sy);
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