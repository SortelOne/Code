public class Main {

    public static void main(String[] args) {
	Songs fire = new Songs("Things We Lost In The Fire", "Bad Blood", "Bastille");
	Songs weakRemix = new Songs("Weak - Remix", "Weak Remixes", "AJR and Gazzo.");
	Songs love = new Songs("Crawl Outta Love", "Crawl Outta Love", "Illenium");

	System.out.println(fire.toString());
	System.out.println(weakRemix.toString());
	System.out.println(love.toString());

	fire.setAlbum("Kelsoooooon");
	weakRemix.setArtist("Not Garrett");
	love.setName("Blake throws me under the bus all the time");

	System.out.println(fire.getAlbum());
	System.out.println(weakRemix.getArtist());
	System.out.println(love.getName());



    }

}
