import java.util.Scanner;

public class Profit {
    public static void main(String[]args) {

        int sales; //How many products sold
        int itemp; //How much each item costs a consumer
        int itemm; //How much it costs to make the item

        Scanner scan = new Scanner(System.in);

        System.out.println("How many products did you sell?");
        sales = scan.nextInt();
        System.out.println("How much did each product cost the consumer?");
        itemp = scan.nextInt();
        System.out.println("How much did it cost for you to make each product?");
        itemm = scan.nextInt();

        grossProduct(sales, itemp, itemm);
    }

    public static double grossProduct(int sales, int itemp, int itemm){
        int money; //Total money made from store
        int income; //How much you actually made
        int lost; //How much you paid to produce the product
        money = sales*itemp;
        System.out.println("Your made " + money + " in total sales from your store.");
        lost = sales*itemm;
        System.out.println("You lost " + lost + " from the purchasing the product.");
        income = money-lost;
        System.out.println("You actually made a profit of " + income + " from your store.");
        return income;

    }
}
