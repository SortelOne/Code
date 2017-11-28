public class Main {

    private static String [][] ticBoard = new String[3][3];

    public static void buildTable() {
        for (int row = 0; row < ticBoard.length; row++) {
            for (int col = 0; col < ticBoard[row].length; col++) {
                ticBoard[row][col] = "{ }";
            }
        }
    }

    public static void printTable(){
        for(int row = 0; row<ticBoard.length; row++){
            for(int col = 0; col<ticBoard[row].length; col++){
                System.out.print(ticBoard[row][col]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        buildTable();
        printTable();
    }
}
