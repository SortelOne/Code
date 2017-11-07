import java.util.Scanner;

public class JOINTHEM {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Initalizing all of the ints and doubles and stuff
        //Profit Calculation
        int sales = 0; //How many products sold
        int itemp = 0; //How much each item costs a consumer
        int itemm = 0; //How much it costs to make the item

        //Triangle
        int l = 0; //How tall the ladder is
        int g = 0; //How far away the ladder is from the tree

        //Morgage
        int p = 0; //Principal
        double r = 0; //Interest rate
        int n = 0; //Total number of payments
        int t = 0; //Time amount of payments per year

        boolean worky = false;

        while (!worky) {
            System.out.println("What calculation do you want to make? Put in......\n1. for Profit Calculation\n2. for Triangle Calculation and \n3. for Morgage calculation\nand 4 to quit");
            int menu = 0;
            menu = scan.nextInt();
            if (menu == 1) {
                grossPro();
                worky = true;
            } else if (menu == 2) {
                Triangle();
                worky = true;
            } else if (menu == 3) {
                mathInterestEquation();
                worky = true;
            } else if (menu == 4) {
                return;
            } else {
                System.out.println("You're dumb");
            }
        }
    }

    public static void grossPro() {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many products did you sell?");
        int sales = scan.nextInt();
        System.out.println("How much did each product cost the consumer?");
        int itemp = scan.nextInt();
        System.out.println("How much did it cost for you to make each product?");
        int itemm = scan.nextInt();

        int money = sales * itemp;
        System.out.println("Your made " + money + " in total sales from your store.");
        int lost = sales * itemm;
        System.out.println("You lost " + lost + " from the purchasing the product.");

        System.out.println("You actually made a profit of " + grossProduct(sales, itemp, itemm, money, lost) + " from your store.");


    }


    public static double grossProduct(int sales, int itemp, int itemm, int money, int lost) {
        int income; //How much you actually made


        income = money-lost;
        return income;
    }

    public static void Triangle() {
        double tree; //How far away the cat is from the tree

        Scanner scan = new Scanner(System.in);

        System.out.println("Is your cat in a tree?\nDo you want to find out how far away\nyour cat is away from the ground?\nIf so then this is the code for you!");
        System.out.println("What is the length of your ladder? (in feet)");
        int l = scan.nextInt();
        System.out.println("How far away is the base of the ladder from the tree? (in feet)");
        int g = scan.nextInt();

        System.out.println("Your cat is about " + TriangleCalc(l, g) + " feet away from the ground.");
    }

    public static double TriangleCalc(int l, int g){
        double tree = Math.sqrt((Math.pow(l, 2))-(Math.pow(g, 2)));
        tree = Math.round(tree);
        return tree;
    }

    public static void mathInterestEquation() {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the Principal of your payment?");
        int p = scan.nextInt();
        System.out.println("What is the Interest Rate?");
        double r = scan.nextDouble();
        System.out.println("How many payments per year are you going to make?");
        int t = scan.nextInt();
        System.out.println("How many payments do you need to make in total?");
        int n = scan.nextInt()*t;

        System.out.printf("The dollar amount of your monthly payments will be about " + mathInterestEquationThingy(p, r, t, n) + ".");
    }
    public static double mathInterestEquationThingy(int p, double r, double n, double t){
        double a = ((p*Math.exp(r*t))/n); //Dollar amount of monthly payments
        a = Math.round(a);
        return a;
    }
}
