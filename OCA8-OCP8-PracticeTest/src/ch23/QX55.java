package ch23;

public class QX55 {

}

class InformationException extends Exception {
}

class LackOfInformationException extends InformationException {
	public LackOfInformationException() { // t1 
		//super(""); //compile error
	}

	public LackOfInformationException(String s) { // t2
		this(new Exception(s)); }
	
	public LackOfInformationException(Exception c) { // t3 
		super();
	}
	
	@Override public String getMessage() {
		return "lackOf"; }
}