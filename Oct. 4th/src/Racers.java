import java.util.Random;

public class Racers extends EzImage{
    private int count;
    private int deltaX;
    private int deltaY;
    private boolean done;
    private int speed1;
    private int speed2;


    public Racers(int x, int y, int w, int h, String i){
        super(x, y, w, h, i);
        count = 0;
        Random gen = new Random();
        speed1 = gen.nextInt(20)+1;
        deltaX = speed1;
        deltaY = speed1;
    }

    public boolean move(){
        count+=speed1;
        int x = this.getX();
        int y = this.getY();
        if(!done) {

            if(count<=250) {
                this.setLocation(x + deltaX, y);
            }
            else if(count<=500) {
                this.setLocation(x, y + deltaY);
            }
            else if(count<=750) {
                this.setLocation(x - deltaX, y);
            }
            else if(count<=1000) {
                this.setLocation(x, y - deltaY);
            }
            else{
                done=true;
            }

            System.out.println(count + " " + count % 10);
        }
        return done;
    }
}
