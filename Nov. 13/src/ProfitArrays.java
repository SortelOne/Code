import java.util.Random;

public class ProfitArrays {
    private double[] ryan;

    public ProfitArrays() {
        ryan = new double[7];
    }

    public void fillArray(){
        Random gen = new Random();
        double sean;
        for (int i = 0; i < ryan.length; i++) {
            sean = gen.nextInt(20) + 1;
            ryan[i] = sean;
        }
    }

    public double[] getSales() {
        return ryan;
    }

    public void printSales(){
        for(int i = 0;i<ryan.length; i++) {
            if(i==1)
                System.out.println("The sales for Monday were as follows: " + ryan[i]);
            if(i==2)
                System.out.println("The sales for Tuesday were as follows: " + ryan[i]);
            if(i==3)
                System.out.println("The sales for Wednesday were as follows: " + ryan[i]);
            if(i==4)
                System.out.println("The sales for Thursday were as follows: " + ryan[i]);
            if(i==5)
                System.out.println("The sales for Friday were as follows: " + ryan[i]);
            if(i==6)
                System.out.println("The sales for Saturday were as follows: " + ryan[i]);
            if(i==7)
                System.out.println("The sales for Sunday were as follows: " + ryan[i]);
        }
    }

    public void maxSales() {
        double max;
        max = ryan[0];
        for (int j = 0; j < ryan.length; j++) {
            if (ryan[j] > max) {
                max = ryan[j];
            }
        }
        System.out.println("The max is: " + max);
    }

    public void getAverage(){
        double average = 0.0;
        for(int i = 0; i<ryan.length;i++) {
            average += ryan[i];
        }
        average=average/ryan.length;
        System.out.println("The average is: " + average);
    }



    public static void main(String[]args){
        ProfitArrays blake = new ProfitArrays();
        blake.fillArray();
        blake.printSales();
        System.out.println();
        blake.getAverage();
        System.out.println();
        blake.maxSales();
    }
}