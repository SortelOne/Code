import java.util.Random;

public class ProfitArrays {
    private int[] ryan;
    private int blake = 0;

    public ProfitArrays() {
        Random gen = new Random();
        ryan = new int[7];
        int sean = 0;
        for (int i = 0; i < ryan.length; i++) {
            sean = gen.nextInt(20) + 1;
            sean = ryan[i];
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

    public int getSales(int z) {
        Random gen = new Random();
        blake = z;
        int day = ryan[z];
        return day;
    }

    public static void main(String[]args){
        //System.out.println("Daily profit for " + blake + getSales(5));
    }

}