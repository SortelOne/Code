import java.util.Random;

public class ProfitArrays {
    private double[] ryan;
    private int blake = 0;

    public double[] returnArrays() {
        Random gen = new Random();
        ryan = new double[7];
        double sean = 0.0;
        for (int i = 0; i < ryan.length; i++) {
            sean = gen.nextInt(20) + 1;
            sean = ryan[i];
        }
        return sean[];
    }

    public double[] getSales() {
        return ryan;
    }

    public void printSales(){
        getSales();
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

    public int getAverage(){
        int average = 0;
        for(int i = 0; i<ryan.length;i++) {
            average += ryan[i];
        }
        average=average/ryan.length;
        return average;
    }



    public static void main(String[]args){

    }
}