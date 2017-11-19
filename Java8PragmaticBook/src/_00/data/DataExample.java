package _00.data;

import java.util.Arrays;
import java.util.List;

public class DataExample {

	public static void main(String[] args) {
		//
		Track track1 =  new Track("Niçin?", 3);
		Track track2 =  new Track("Hiç Canım Yanmaz?", 4);
		Track track3 =  new Track("Denize Doğru", 2);
		Track track4 =  new Track("Benimle Oynar mısın??", 2);
		List<Track> trackList = Arrays.asList(track1,track2,track3,track4);
		//
		Artist artist = new Artist("Bülent Ortaçgil", "Turkey");
		List<Artist> artistList = Arrays.asList(artist);
		//
		Album album = new Album("Senfonik Ortaçgil", trackList, artistList);
		
		
	}
}
