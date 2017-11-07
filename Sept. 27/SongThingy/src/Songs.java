public class Songs {
    private String name;
    private String album;
    private String artist;

    public Songs(String n, String al, String ar){
        name = n;
        album = al;
        artist = ar;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public void setAlbum(String bum) {
        bum = album;
    }

    public void setArtist(String art) {
        art = artist;
    }

    public void setName(String na) {
        na = name;
    }

    public String toString() {
        return "This song is called " + name + ". It is by " + artist + " and is in the album " + album + ".";
    }
}
