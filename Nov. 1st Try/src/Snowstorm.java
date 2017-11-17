import java.awt.*;
import java.util.Random;

public class Snowstorm extends ButtonWindow {
    private ButtonWindowFrame win;
    private Snowflake klesor[] = new Snowflake[203];

    public Snowstorm() {
        win = new ButtonWindowFrame("SNOWWWWW");
        win.setBounds(0,0, 1000,1000);
        win.addAnimateButton(0, 0, 100, 25);
        win.getContentPane().setBackground(Color.BLACK);

        Random gen = new Random();
        int kelsooon;

        for(int i = 0; i<klesor.length; i++) {
            kelsooon = gen.nextInt(600) + 1;
            int x = kelsooon;
            int y = 50;
            klesor[i] = new Snowflake(x, y);
            win.add(klesor[i]);
            win.repaint();
        }

        win.setVisible(true);
    }

    public void act(){
        for(int i = 0; i<klesor.length; i++) {
            klesor[i].move(klesor.length);
        }
    }
}
