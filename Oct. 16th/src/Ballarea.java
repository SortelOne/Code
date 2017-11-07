import javax.swing.*;
import java.awt.Color;
import java.util.Random;

public class Ballarea extends ButtonWindow {
    private ButtonWindowFrame win;
    private Ball sean;
    private Ball pokemom;
    private Ball pokemom2;
    private Ball pokemom3;
    private Ball pokemom4;
    private Ball pokemom5;
    private JLabel caught;

    public Ballarea() {
        win = new ButtonWindowFrame("Freaking Ball");
        win.addAnimateButton(400, 450, 100, 25);
        Rectangle screenOutside = new Rectangle (10, 10, 400, 400, Color.BLACK);
        win.add(screenOutside, 0);
        screenOutside.setBackground(Color.decode("#0e421d"));
        Rectangle screenInside = new Rectangle (20, 20, 380, 380);
        screenInside.setBackground(Color.decode("#296b3c"));
        win.add(screenInside, 0);
        Random gen = new Random();
        int f = gen.nextInt(50)+1;
        int h = gen.nextInt(70)+1;
        sean = new Ball(f, h, 25, 25, "ballpic.png");
        win.add(sean,0);
        pokemom = new Ball(180, 180, 80, 80, "Arceus.png");
        win.add(pokemom, 0);
        pokemom2 = new Ball(320, 320, 80, 80, "Torterra.png");
        win.add(pokemom2, 0 );
        pokemom3 = new Ball(320, 5, 80, 80, "Hydreigon.png");
        win.add(pokemom3, 0);
        pokemom4 = new Ball(5, 320, 80, 80, "Gardevoir.png");
        win.add(pokemom4, 0);
        pokemom5 = new Ball(10, 10, 50, 45, "MimikyuDone.png");
        win.add(pokemom5, 0);
        win.repaint();
        win.setVisible(true);
    }

    public void act(){
        sean.move();
        pokemom.move();
        //pokemom2.move();
        //pokemom3.move();
        //pokemom4.move();
        //pokemom5.move();
        if(sean.collision(pokemom.getX(), pokemom.getY(), pokemom.getHeight(), pokemom.getWidth())){
            pokemom.setVisible(false);
            caught = new JLabel("Arceus was caught!");
            caught.setBounds(20, 500, 200, 25);
            win.add(caught, 0);
            caught.setVisible(true);
            win.repaint();
        }
        if(sean.collision(pokemom2.getX(), pokemom2.getY(), pokemom2.getHeight(), pokemom2.getWidth())){
            pokemom2.setVisible(false);
            caught = new JLabel("Torterra was caught!");
            caught.setBounds(200, 500, 200, 25);
            win.add(caught, 0);
            caught.setVisible(true);
            win.repaint();
        }
        if(sean.collision(pokemom3.getX(), pokemom3.getY(), pokemom3.getHeight(), pokemom3.getWidth())){
            pokemom3.setVisible(false);
            caught = new JLabel("Hydreigon was caught!");
            caught.setBounds(20, 550, 200, 25);
            win.add(caught, 0);
            caught.setVisible(true);
            win.repaint();
        }
        if(sean.collision(pokemom4.getX(), pokemom4.getY(), pokemom4.getHeight(), pokemom4.getWidth())){
            pokemom4.setVisible(false);
            caught = new JLabel("Gardevoir was caught!");
            caught.setBounds(200, 550, 200, 25);
            win.add(caught, 0);
            caught.setVisible(true);
            win.repaint();
        }
        if(sean.collision(pokemom5.getX(), pokemom5.getY(), pokemom5.getHeight(), pokemom5.getWidth())){
            pokemom5.setVisible(false);
            caught = new JLabel("Mimikyu was caught!");
            caught.setBounds(200, 600, 200, 25);
            win.add(caught, 0);
            caught.setVisible(true);
            win.repaint();
        }
    }

    public static void main(String[]args){
        Oval kelson = new Oval(15, 15, 20, 20);
    }
}
