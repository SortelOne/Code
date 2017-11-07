import java.util.Scanner;

public class TriangleCalc {
    public static void main(String[]args){
        int l; //How tall the ladder is
        int g; //How far away the ladder is from the tree
        Scanner scan = new Scanner(System.in);
        System.out.println("Is your cat in a tree?\nDo you want to find out how far away\nyour cat is away from the ground?\nIf so then this is the code for you!");
        System.out.println("What is the length of your ladder? (in feet)");
        l = scan.nextInt();
        System.out.println("How far away is the base of the ladder from the tree? (in feet)");
        g = scan.nextInt();

        TriangleCalc(l, g);
    }
    public static double TriangleCalc(int l, int g) {
        double tree; //How far away the cat is from the tree
        tree = Math.sqrt((Math.pow(l, 2))-(Math.pow(g, 2)));
        tree = Math.round(tree);
        System.out.println("Your cat is about " + tree + " feet away from the ground.");
        return tree;
    }
}
