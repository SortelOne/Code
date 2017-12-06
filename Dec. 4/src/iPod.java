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
        System.out.println("Input a song name!");
        String sn = scan.nextLine();
    }

    public void printSongs() {
        for (Song s : songList) {
            System.out.println(s);
        }
    }

    public static void main (String[]args){
        iPod garrett = new iPod();
    }
}
