package ch20;

import java.util.ArrayList;
import java.util.List;

public class QX28 {

}

// C. The code compiles and is not thread-safe.
class ThreadSafeList {

	private List<Integer> data = new ArrayList<>();

	public synchronized void addValue(int value) {
		data.add(value);
	}

	public int getValue(int index) {
		return data.get(index);
	}

	public int size() {
		synchronized (ThreadSafeList.class) {
			return data.size();
		}
	}

}