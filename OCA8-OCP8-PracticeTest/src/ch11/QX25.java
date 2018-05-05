package ch11;

public class QX25 {
	
	public static void main(String[] args) {
		
		Watch watch = new Watch();
		SmartWatch smartWatch = new SmartWatch();
		System.out.print(watch.getName(","));
		System.out.print(smartWatch.getName(""));
		
	}
}

class SmartWatch extends Watch {
	private String getType() {
		return "smart watch";
	}

	public String getName(String suffix) {
		return getType() + suffix;
	}
}

class Watch {
	private String getType() {
		return "watch";
	}

	public String getName(String suffix) {
		return getType() + suffix;
	}
}