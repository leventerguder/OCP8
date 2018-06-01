package ch23;

public class QX77 {

	public static void main(String[] args) {

		WatchQX77 watch = new WatchQX77();
		WatchQX77 smartWatch = new SmartWatch();

		System.out.print(watch.getName(","));
		System.out.print(smartWatch.getName(""));
		
		// watch,watch
	}
}

class WatchQX77 {
	private String getType() {
		return "watch";
	}

	public String getName(String suffix) {
		return getType() + suffix;
	}
}

class SmartWatch extends WatchQX77 {
	private String getType() {
		return "smart watch";
	}

	public String getName() {
		return getType() + ",";
	}
}