import java.util.ArrayList;
import java.util.Scanner;

public class iPod {

    private ArrayList<Song> songList;

    public iPod() {
        songList = new ArrayList<Song>();
        songList.add(new Song("Another Day in Paradise", "Change of Scenery", "Quinn XCII"));
        songList.add(new Song("Little Lion Man", "Sigh No More", "Mumford and Sons"));
        songList.add(new Song("Rumors", "EP",  "Jake Miller"));

        System.out.println(songList);

        songList.set(0, new Song("Symphony", "So Good", "Clean Bandit"));

        String name = songList.get(1).getName().toUpperCase();

        System.out.println(name);

        Song trial = songList.get(1);
        trial.setName("New Name");

        System.out.println(songList);

        printSongs();

    }

    public void addSongs(){
        Scanner scan = new Scanner(System.in);
        String ans;
        String sn;
        String ar;
        String al;
        String ano;
        int nums = getNumOfSongs();
        do {
            do {
                System.out.println("Input a song name (and just the song name)!");
                sn = scan.nextLine();
                System.out.println("Now put in the artist!");
                ar = scan.nextLine();
                System.out.println("Now put in the album!");
                al = scan.nextLine();
                System.out.println("The song you typed was " + sn + "\n with the artis being " + ar + "\n and it is in the album " + al + ". Is that correct?");
                System.out.println("If so, type yes, if not, type no.");
                ans = scan.nextLine();
            } while (!ans.equalsIgnoreCase("yes"));
            songList.set(nums, new Song(sn, ar, al));
            System.out.println("Would you like to add another song?\nType yes for yes and type no for no\n(Dont ask me why I have to explain that");
            ano = scan.nextLine();
            nums++;
        }while(!ano.equalsIgnoreCase("yes"));
    }

    public void printSongs() {
        for (Song s : songList) {
            System.out.println(s);
        }
    }

    public int getNumOfSongs(){
        int size = songList.size();
        return size;
    }

    public void findSongs(){
        Scanner scan = new Scanner (System.in);
        String cDone;
        boolean found = false;
        Song gotIt = null;
        String again;

        do {
            System.out.println("Type in a song name.");
            String input = scan.nextLine();

            for (Song s : songList) {
                if (s.getName().equalsIgnoreCase(input)){
                    found = true;
                    gotIt = s;
                }
            }
            if (found == true) {
                System.out.println(gotIt + " was found!");
            }
            else if (found != true){
                System.out.println("We didnt find any songs under that name.");
            }
            else{
                System.out.println("You didn't put in a valid name.");
            }
            System.out.println("Would you like to go again");
            cDone = scan.nextLine();
        }while(!cDone.equalsIgnoreCase("yes"));
    }

    public static void main (String[]args){
        iPod garrett = new iPod();
        int menu;
        Scanner scan = new Scanner (System.in);
        String more;
        System.out.println("Welcome to your iPod!");

        do {
            menu = 0;
            System.out.println("Type 1 to print your songs\n2 to add a song and \n3 to find a song.");
            menu = scan.nextInt();
            if (menu == 1) {
                garrett.printSongs();
            } else if (menu == 2) {
                garrett.addSongs();
            } else if (menu == 3) {
                garrett.findSongs();
            } else {
                System.out.println("That is not a valid input, try again");
            }
            System.out.println("Would you like to do something else?\nType yes for yes and no for no.");
            more = scan.nextLine();
        }while(!more.equalsIgnoreCase("yes"));
    }
}
