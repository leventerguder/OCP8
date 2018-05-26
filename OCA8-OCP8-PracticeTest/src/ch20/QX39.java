package ch20;

import java.util.List;
import java.util.Arrays;

public class QX39 {

	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6);
		SearchList<Integer> t = new SearchList<Integer>(data);
		t.exists(5, 0, data.size());
		System.out.print(t.foundMatch);
	}
}

class SearchList<T> {

	private List<T> data;
	boolean foundMatch = false;

	public SearchList(List<T> list) {
		this.data = list;
	}

	public void exists(T value, int start, int end) {
		if (end - start <= 1) {
			foundMatch = foundMatch || value.equals(data.get(start));
		} else {
			final int middle = start + (end - start) / 2;
			new Thread(() -> exists(value, start, middle)).run();
			new Thread(() -> exists(value, middle, end)).run();
			// Calling run() on a Thread runs
			// the process as part of the current thread.!
		}
	}
}