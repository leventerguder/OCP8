package _02.stream;

import java.util.List;
import java.util.function.Function;
import java.util.Arrays;
import java.util.Comparator;

import _00.data.Track;

public class Example7 {

	public static void main(String[] args) {

		List<Track> tracks = Arrays.asList(new Track("Bakai", 524), new Track("Violets for Your Furs", 378),
				new Track("Time Was", 451));

		Track shortestTrackOld = tracks.get(0);
		for (Track track : tracks) {
			if (track.getLength() < shortestTrackOld.getLength()) {
				shortestTrackOld = track;
			}
		}

		Function<Track, Integer> f1 = track -> track.getLength();
		Function<Track, Integer> f2 = Track::getLength;

		Comparator<Track> comparator1 = Comparator.comparing(f1);
		Comparator<Track> comparator2 = Comparator.comparing(f2);

		Track shortestTrack = tracks.stream().min(comparator1).get();
		Track longestTrack = tracks.stream().max(comparator2).get();

		System.out.println(shortestTrackOld);
		System.out.println(shortestTrack);
		System.out.println(longestTrack);
	}
}
