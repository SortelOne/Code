import javax.swing.*;
import java.net.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
	    URL url = new URL("file://localhost/Users/23542/Documents/GitHub/ClassClasses/Code/gifPractice/squishyDoggo.gif");
	    Icon icon = new ImageIcon(url);
	    JLabel label = new JLabel(icon);
	    JFrame f = new JFrame("Animation");
	    f.getContentPane().add(label);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.pack();
	    f.setLocation((int)(Math.random()*1000), (int)(Math.random()*1000));
	    f.setResizable(false);
	    f.setVisible(true);
    }
}
