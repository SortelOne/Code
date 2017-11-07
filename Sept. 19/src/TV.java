public class TV {
    private int screenSize;
    private String monitorType;
    private boolean isOn;
    private int volume;

    public TV() {
        screenSize = 35;
        monitorType = "CRT";
        isOn = false;
        volume = 0;
    }

    public TV(int s, String m){
            screenSize = s;
            monitorType = m;
            isOn = false;
            volume = 0;
    }

    public void printTV(){
        System.out.println("This " + screenSize + " " + monitorType + " tv has a volume of " + volume + ".");
        System.out.println("It is " + isOn + " that the tv is on.");
    }

    public static void main (String[]args){
        TV TELEVISION = new TV();
        TELEVISION.printTV();
        TV NEWTV = new TV(500, "OLED");
        NEWTV.printTV();
        TV EXTRATV = new TV(12, "LCD");
        EXTRATV.printTV();
        NEWTV.printTV();
    }

}
