import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void writeToFile(){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("MinecraftServerStuff.txt"));
            writer.write("More farms\r\n");
            writer.write("Make it pretty\r\n");
            writer.write("Maybe move\r\n");
            writer.write("Get other basic machinery\r\n");
            writer.write("Automate crafting with ME System\r\n");
            writer.close();
        }catch(IOException e) {
            System.out.println("Try again? Maybe. Idk.");
            e.printStackTrace();
        }
    }

    public static void readFromFile(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("MinecraftServerStuff.txt"));
            String line = null;
            do {
                line = reader.readLine();
                if (line != null)
                    System.out.println(line);
            }while(line != null);
            reader.close();
        }catch(IOException e){
            System.out.println("There was an error reading from the file");
            e.printStackTrace();
        }
    }

    public static void saveData(){
        try{
            //Create an object that opens a file for writing data
            //FileOutputStream fileOut = new FileOutputStream("info.txt");
            //Create a stream object that connects to the file
            DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("info.txt"));
            dataOut.writeInt(42);
            dataOut.writeDouble(4.5);
            dataOut.writeBoolean(true);
            dataOut.close();

        }catch(IOException e)
        {
            System.out.println("Couldn't read from the file");
            e.printStackTrace();
        }
    }

    public static void readData(){
        try {
            //Create an object that opens a file for writing data
            //FileInputStream fileIn = new FileInputStream("info.txt");
            //Create a stream object that connects to the file
            DataInputStream dataIn = new DataInputStream(new FileInputStream("info.txt"));
            int i = dataIn.readInt();
            double d = dataIn.readDouble();
            boolean b = dataIn.readBoolean();
            System.out.println(i);

            dataIn.close();

        }catch(IOException e){
            System.out.println("Couldn't read from file");
            e.printStackTrace();
        }
    }

    public static void arrayToFile(ArrayList<String> theList){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("vacation.txt"));
            for(int i = 0; i < theList.size(); i++){
                writer.write(theList.get(i) + "\r\n");
            }
            writer.close();
        }catch(IOException e){
            System.out.println("There was a problem writing to this file.");
            e.printStackTrace();
        }
    }

    public static void printArray(ArrayList<String> theList){
        try {
            for (int i = 0; i < theList.size(); i++)
                System.out.println(theList.get(i));
        }catch(Exception e){
            System.out.println("There was a problem printing the list");
        }
    }

    public static void fileToArray(ArrayList list){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("MinecraftServerStuff.txt"));
            String line = null;
            do{
                line = reader.readLine();
                if(line != null)
                    list.add(line);
            }while(line != null);
            reader.close();
        }catch(IOException e){
            System.out.println("There was a problem reading from this file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeToFile();
        readFromFile();
        ArrayList<String>theList = new ArrayList<String>();
        fileToArray(theList);
        printArray(theList);
        arrayToFile(theList);
        saveData();
        readData();
    }
}
