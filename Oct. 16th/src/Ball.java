public class Ball extends EzImage {

    private int deltaX;
    private int deltaY;
    private int speed;
    private int numX = 1;
    private int numY = 1;

    public Ball(int x, int y, int w, int h, String i) {
        super(x, y, w, h, i);
        speed = 15;
    }

    public boolean collision(int x, int y, int h, int w){
        boolean collide = false;
        int balltop = this.getY();
        int ballright = this.getX()+25;
        int ballbottom = this.getY()+25;
        int ballleft = this.getX();

        int poketop = y;
        int pokeright = x+w;
        int pokebottom = y+h;
        int pokeleft = x;

        //collision stuffs
        if(balltop>poketop && balltop<pokebottom && ballright>pokeleft&&ballright<pokeright
                ||balltop>poketop && balltop<pokebottom && ballleft>pokeleft && ballleft<pokeright
                ||ballbottom>poketop && ballbottom<pokebottom && ballleft>pokeleft && ballleft<pokeright
                ||balltop>pokebottom && ballbottom<poketop && ballleft<pokeright && ballright>pokeleft){
            collide = true;
        }

        return collide;
    }

    public void move() {
        int x = this.getX();
        int y = this.getY();

        if(x>=375) {
            numX=-1;
        }
        if(y>=375){
            numY=-1;
        }
        if(x<=10){
            numX=1;
        }
        if(y<=10){
            numY=1;
        }


        this.setLocation((x + ((numX*speed)+5)), (y + (numY*speed)));

    }

}
