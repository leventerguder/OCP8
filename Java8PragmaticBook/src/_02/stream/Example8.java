package _02.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import _00.data.Album;
import _00.data.Artist;
import _00.data.SampleData;

public class Example8 {

	public static void main(String[] args) {
		//

		Stream<Album> albums = SampleData.albums;
		Stream<Album> albums2 = SampleData.getAlbums();
		Stream<Album> albums3 =  SampleData.getAlbums();
		Stream<Album> albums4 =  SampleData.getAlbums();
		
		
		//
		Stream<List<Artist>> musicianList1 = albums.map(a -> a.getMusicianList());
		Stream<List<Artist>> musicianList2 = albums2.map(a -> a.getMusicianList());
		//
		Stream<Stream<Artist>> musicianStream1 = albums3.map(a -> a.getMusicians());
		Stream<Stream<Artist>> musicianStream2 = albums4.map(a -> a.getMusicians());

		Stream<Artist> artists1 = musicianList1.flatMap(s -> s.stream()); // Stream<List<Artist>> -> Stream<Artist>
		Stream<Artist> artists2 = musicianStream1.flatMap(s -> s); // Stream<Stream<Artist>> -> Stream<Artist>
		Stream<Artist> artists3 = musicianStream2.flatMap(Function.identity()); //Stream<Stream<Artist>> -> Stream<Artist>
		
		///
		List<String> origins = musicianList2.flatMap(s -> s.stream()).
								filter( ar -> ar.getName().
								startsWith("John")).map(ar -> ar.getNationality()).
								collect(Collectors.toList()); 
		
		System.out.println(origins);
		//
		
		List<Album> albumList = SampleData.getAlbumsList();
		List<String> tracksName = albumList.stream().
								  flatMap(al -> al.getTracks()).
								  filter(tr -> tr.getLength()>10).
								  map(tr -> tr.getName()).
								  collect(Collectors.toList());
		
		System.out.println(tracksName);

	}
}
