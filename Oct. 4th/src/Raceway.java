import java.awt.Color;
import javax.swing.*;

public class Raceway extends ButtonWindow{
    private ButtonWindowFrame win;
    private Racers garrett;
    private Racers sean;
    private boolean done;
    private JLabel winner;
    private JLabel whoWon;

    public Raceway(){
        win = new ButtonWindowFrame("Garrett is going to lose");
        win.addAnimateButton(350, 350, 100, 25);
        //track1();
        Rectangle trackoneoutside = new Rectangle(10, 10, 300, 300, Color.BLACK);
        win.add(trackoneoutside, 0);
        Rectangle trackoneinside = new Rectangle(60, 60, 180, 180, Color.GREEN);
        trackoneinside.setBackground(Color.decode("#238e35"));
        win.add(trackoneinside, 0);
        //track2();
        Rectangle trackoneoutside2 = new Rectangle(350, 10, 300, 300, Color.BLACK);
        win.add(trackoneoutside2, 0);
        Rectangle trackoneinside2 = new Rectangle(400, 60, 180, 180, Color.GREEN);
        trackoneinside2.setBackground(Color.decode("#238e35"));
        win.add(trackoneinside2, 0);

        //Racer1
        garrett = new Racers(12, 12, 40, 40, "bulbapic.png");
        sean = new Racers(352, 12, 40, 40, "squirtpic.png");
        win.add(sean, 0);
        win.add(garrett,0);
        winner = new JLabel("Start?!");
        winner.setBounds(50, 450, 200, 25);
        win.add(winner,0);
        done = false;
        win.repaint();
        win.setVisible(true);
    }

    public void act(){
        if(garrett.move()||sean.move()){
            win.stop();
        }
        if(garrett.move()) {
            whoWon = new JLabel("Bulbasaur won!");
            whoWon.setBounds(50, 550, 200, 25);
            win.add(whoWon, 0);
            whoWon.setVisible(true);
        }
        else if(sean.move()) {
            whoWon = new JLabel("Squirtle won!");
            whoWon.setBounds(50, 550, 200, 25);
            win.add(whoWon, 0);
            whoWon.setVisible(true);
        }
    }
}
