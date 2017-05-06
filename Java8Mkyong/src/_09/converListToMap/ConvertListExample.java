package _09.converListToMap;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Date;

public class ConvertListExample {

	public static void main(String[] args) {

		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1, "liquidweb.com", new Date()));
		list.add(new Hosting(2, "linode.com", new Date()));
		list.add(new Hosting(3, "digitalocean.com", new Date()));

		Map<Integer, String> map1 = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName));

		Function<Hosting, Integer> f1 = h -> h.getId();
		Function<Hosting, String> f2 = h -> h.getName();

		Map<Integer, String> map2 = list.stream().collect(Collectors.toMap(f1, f2));
		
		System.out.println(map1);
		System.out.println(map2);
	}
}
