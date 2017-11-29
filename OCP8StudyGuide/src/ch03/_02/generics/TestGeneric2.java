package ch03._02.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class TestGeneric2 {

	public static void main(String[] args) {
		// HashSet<Number> hs = new HashSet<Integer>(); //compiler error
		HashSet<? super ClassCastException> set = new HashSet<Exception>();
		List<String> list = new Vector<String>();
		// List<Object> objects = new ArrayList<? extends Object>();
		Map<String, ? extends Number> hm = new HashMap<String, Integer>();
	}
}
