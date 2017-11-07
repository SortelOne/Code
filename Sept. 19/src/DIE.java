import java.awt.Color;
import javax.swing.*;
import java.util.Random;

public class DIE extends Rectangle{

    private Oval one;
    private Oval two;
    private Oval three;
    private Oval four;
    private Oval five;
    private Oval six;
    private Oval seven;

    private static int roll;

    private static int getRoll() {
        Random gen = new Random();
        roll = gen.nextInt(6)+1;
        return roll;
    }


    private DIE(int x, int y) {
        super(x, y, 100, 100);
        one = new Oval(15, 25, 10, 10);
        two = new Oval(15, 50, 10, 10);
        three = new Oval(15, 75, 10, 10);
        four = new Oval(40, 50, 10, 10);
        five = new Oval(65, 25, 10, 10);
        six = new Oval(65, 50, 10, 10);
        seven = new Oval(65, 75, 10, 10);

        this.setBackground(Color.decode("#ffffff"));

        this.add(one);
        this.add(two);
        this.add(three);
        this.add(four);
        this.add(five);
        this.add(six);
        this.add(seven);
    }

    private void displayDots(){
        one.setVisible(roll == 2 || roll == 3 || roll == 4 || roll == 5 || roll == 6);
        two.setVisible(roll == 6);
        three.setVisible(roll == 4 || roll == 5 || roll == 6);
        four.setVisible(roll == 1 || roll == 3 || roll == 5);
        five.setVisible(roll == 4 || roll == 5 || roll == 6);
        six.setVisible(roll == 6);
        seven.setVisible(roll == 2 || roll == 3 || roll == 4 || roll == 5 || roll == 6);
    }

    public static void main (String[]args){
        int rollvalue = 0;
        JFrame frame = new JFrame("Dice");
        DIE diceone = new DIE(20, 20);
        DIE dicetwo = new DIE(130, 20);
        DIE dicethree = new DIE(240, 20);
        DIE dicefour = new DIE(20, 130);
        DIE dicefive = new DIE(20, 240);

        frame.setBounds(30, 30, 500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        //Dice
        getRoll();
        frame.add(diceone);
        diceone.displayDots();
        rollvalue=roll+rollvalue;
        getRoll();
        frame.add(dicetwo);
        dicetwo.displayDots();
        rollvalue=roll+rollvalue;
        getRoll();
        frame.add(dicethree);
        dicethree.displayDots();
        rollvalue=roll+rollvalue;
        getRoll();
        frame.add(dicefour);
        dicefour.displayDots();
        rollvalue=roll+rollvalue;
        getRoll();
        frame.add(dicefive);
        dicefive.displayDots();
        rollvalue=roll+rollvalue;
        JLabel text = new JLabel("The rolls all added up are " + rollvalue + ".");
        text.setBounds(150, 270, 200, 200);
        text.setVisible(true);
        frame.add(text);
    }

}