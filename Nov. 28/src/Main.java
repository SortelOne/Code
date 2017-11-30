import java.util.Scanner;

public class Main {

    private static String [][] ticBoard = new String[4][4];
    public static String xOrY;

    public static void takeInput(){
        boolean win = false;
        int row;
        int col;
        boolean xCoord = false;
        boolean yCoord = false;
        boolean let = false;
        char xxOrY;
        xOrY = "";
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Please put in your x coordinate and press enter.");
            row = scan.nextInt();
            if (row != 1 && row != 2 && row !=3) {
                System.out.println("That is not within the bounds, try again");
                row = 0;
            }
            if(row==1 || row==2 || row==3)
                xCoord = true;
        }while(xCoord==false);
        do{
            System.out.println("Please put in your y coordinate and press enter.");
            col = scan.nextInt();
            if (col != 1 && col != 2 && col !=3) {
                System.out.println("That is not within the bounds, try again");
                row = 0;
            }
            if(col == 1 || col == 2 || col == 3)
                yCoord = true;
        }while(yCoord==false);
        do{
            System.out.println("Now put in either X or O (Whichever you are).");
            xOrY = scan.next();
            xxOrY = xOrY.charAt(0);
            if(xxOrY != 'X' && xxOrY != 'O'){
                System.out.println("That's not a valid input, try again");
            }
            if (xxOrY == 'X'){
                ticBoard[row][col] = "{X}";
                let=true;
            }
            if(xxOrY == 'O'){
                ticBoard[row][col] = "{O}";
                let=true;
            }
        }while(let==false);

        printTable();
        xCoord = false;
        yCoord = false;
        let = false;
    }

    public static void winCondition(){

    }

    public static void buildTable() {
        for (int row = 1; row < ticBoard.length; row++) {
            for (int col = 1; col < ticBoard[row].length; col++) {
                ticBoard[row][col] = "{ }";
            }
        }
    }

    public static void printTable(){
        for(int row = 1; row<ticBoard.length; row++){
            for(int col = 1; col<ticBoard[row].length; col++){
                System.out.print(ticBoard[row][col]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        buildTable();
        printTable();
        boolean win = false;
        System.out.println("Welcome to Tic Tac Toe!");
        do{
            takeInput();
        }while(win==false);

    }
}
