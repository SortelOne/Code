public class Song {

    private String name;
    private String artist;


    public Song(String n, String ar){

        name = n;
        artist = ar;

    }
    public String getName(){
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String toString(){
        return "\""+name+"\" is by "+artist+" ";
    }
}