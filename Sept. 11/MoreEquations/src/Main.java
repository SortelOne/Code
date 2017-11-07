import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int p; //Principal
        double r; //Interest rate
        int n; //Total number of payments
        int t; //Time amount of payments per year
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the Principal of your payment?");
        p = scan.nextInt();
        System.out.println("What is the Interest Rate?");
        r = scan.nextDouble();
        System.out.println("How many payments per year are you going to make?");
        t = scan.nextInt();
        System.out.println("How many payments do you need to make in total?");
        n = scan.nextInt()*t;


        mathInterestEquationThingy(p, r, n, t);

    }
    public static double mathInterestEquationThingy(int p, double r, int n, double t) {
        double a; //Dollar amount of monthly payments
        a = ((p*Math.exp(r*t))/n);
        a = Math.round(a);
        System.out.printf("The dollar amount of your monthly payments will be about " + a + ".");
        return a;
    }
}
