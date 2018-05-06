package ch12;

public class QX34 {

}

enum Proposition {
	TRUE(-10) {
		@Override
		String getNickName() {
			return "RIGHT";
		}
	},
	FALSE(-10) {
		public String getNickName() {
			return "WRONG";
		}
	},
	UNKNOWN(0) {
		@Override
		public String getNickName() {
			return "LOST";
		}
	};
	private final int value;

	Proposition(int value) {
		this.value = value;
	}

	abstract String getNickName();

}