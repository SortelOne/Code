import java.util.Random;

public class Snowstorm extends ButtonWindow {
    private ButtonWindowFrame win;
    private Snowflake klesor[] = new Snowflake[20];

    public Snowstorm() {
        win = new ButtonWindowFrame("SNOWWWWW");
        win.addAnimateButton(400, 450, 100, 25);

        Random gen = new Random();
        int kelsooon;

        Snowflake[] klesor = new Snowflake[20];

        for(int i = 0; i<klesor.length; i++) {
            kelsooon = gen.nextInt(400) + 1;
            int x = kelsooon;
            int y = 50;
            klesor[i] = new Snowflake(x, y);
            win.add(klesor[i]);
        }
    }

    public void act(){
        for(int i = 0; i<klesor.length; i++) {
            //klesor[i].move;
        }


    }
}
