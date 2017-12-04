import java.util.ArrayList;

public class YourSoul {

    private ArrayList <Song> songList;

    public YourSoul() {
        songList = new ArrayList<Song>();
        songList.add(new Song("Another Day in Paradise", "Quinn XCII"));
        songList.add(new Song("Little Lion Man", "Mumford and Sons"));
        songList.add(new Song("Rumors", "Jake Miller"));

        System.out.println(songList);

        songList.set(0, new Song("Symphony", "Clean Bandit"));

        String name = songList.get(1).getName().toUpperCase();

        System.out.println(name);

        Song trial = songList.get(1);
        trial.setName("Nwe Name");

        System.out.println(songList);

    }
}
