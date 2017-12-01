import java.util.Scanner;

public class Main {

    private static String [][] ticBoard = new String[4][4];
    public static String xOrY;

    public static void takeInput(){
        int row;
        int col;
        boolean xCoord = false;
        boolean yCoord = false;
        boolean let = false;
        char xxOrY;
        boolean board = false;
        xOrY = "";

        Scanner scan = new Scanner(System.in);
        do {
            do {
                System.out.println("Please put in your x coordinate and press enter.");
                col = scan.nextInt();
                if (col != 1 && col != 2 && col != 3) {
                    System.out.println("That is not within the bounds, try again");
                    row = 0;
                }
                if (col == 1 || col == 2 || col == 3)
                    yCoord = true;
            } while (yCoord == false);
            do {
                System.out.println("Please put in your y coordinate and press enter.");
                row = scan.nextInt();
                if (row != 1 && row != 2 && row != 3) {
                    System.out.println("That is not within the bounds, try again");
                    row = 0;
                }
                if (row == 1 || row == 2 || row == 3)
                    xCoord = true;
            } while (xCoord == false);
            if (ticBoard[row][col]!="{ }"){
                System.out.println("That spot is already taken, try a new one.");
            }
            else if(ticBoard[row][col] == "{ }"){
                board=true;
            }
        }while(board==false);
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

    public static boolean winCondition(){
        boolean winner=false;

        //Diagonal top left bottom right X
        if(ticBoard[1][1]=="{X}" && ticBoard[2][2]=="{X}" && ticBoard[3][3]=="{X}") {
            winner=true;
            System.out.println("X won!");
        }
        //Diagonal top left bottom right O
        else if(ticBoard[1][1]=="{O}" && ticBoard[2][2]=="{O}" && ticBoard[3][3]=="{O}") {
            winner=true;
            System.out.println("O won!");
        }
        //Diagonal top right bottom left X
        else if(ticBoard[1][3]=="{X}" && ticBoard[2][2]=="{X}" && ticBoard[3][1]=="{X}"){
            winner=true;
            System.out.println("X won!");
        }
        //Diagonal top right bottom left O
        else if(ticBoard[1][3]=="{O}" && ticBoard[2][2]=="{O}" && ticBoard[3][1]=="{O}"){
            winner=true;
            System.out.println("O won!");
        }
        //Bottom X
        else if(ticBoard[3][1] == "{X}" && ticBoard[3][2] == "{X}" && ticBoard[3][3] == "{X}"){
            winner=true;
            System.out.println("X won!");
        }
        //Bottom O
        else if(ticBoard[3][1] == "{O}" && ticBoard[3][2] == "{O}" && ticBoard[3][3] == "{O}"){
            winner=true;
            System.out.println("O won!");
        }
        //Middle X
        else if(ticBoard[2][1] == "{X}" && ticBoard[2][2] == "{X}" && ticBoard[2][3] == "{X}"){
            winner=true;
            System.out.println("X won!");
        }
        //Middle O
        else if(ticBoard[2][1] == "{O}" && ticBoard[2][2] == "{O}" && ticBoard[2][3] == "{O}"){
            winner=true;
            System.out.println("O won!");
        }
        //Top X
        else if(ticBoard[1][1] == "{X}" && ticBoard[1][2] == "{X}" && ticBoard[1][3] == "{X}"){
            winner=true;
            System.out.println("X won!");
        }
        //Top O
        else if(ticBoard[1][1] == "{O}" && ticBoard[1][2] == "{O}" && ticBoard[1][3] == "{O}"){
            winner=true;
            System.out.println("O won!");
        }
        //Left X
        else if(ticBoard[1][1] == "{X}" && ticBoard[2][1] == "{X}" && ticBoard[3][1] == "{X}"){
            winner=true;
            System.out.println("X won!");
        }
        //Left O
        else if(ticBoard[1][1] == "{O}" && ticBoard[2][1] == "{O}" && ticBoard[3][1] == "{O}"){
            winner=true;
            System.out.println("O won!");
        }
        //Mid X
        else if(ticBoard[1][2] == "{X}" && ticBoard[2][2] == "{X}" && ticBoard[3][2] == "{X}"){
            winner=true;
            System.out.println("X won!");
        }
        //Mid O
        else if(ticBoard[1][2] == "{O}" && ticBoard[2][2] == "{O}" && ticBoard[3][2] == "{O}"){
            winner=true;
            System.out.println("O won!");
        }
        //Right X
        else if(ticBoard[1][3] == "{X}" && ticBoard[2][3] == "{X}" && ticBoard[3][3] == "{X}"){
            winner=true;
            System.out.println("X won!");
        }
        //Right O
        else if(ticBoard[1][3] == "{O}" && ticBoard[2][3] == "{O}" && ticBoard[3][3] == "{O}"){
            winner=true;
            System.out.println("O won!");
        }
        return winner;
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
            win = winCondition();
        }while(win==false);

    }
}
