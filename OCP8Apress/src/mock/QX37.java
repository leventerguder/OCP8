package mock;

import java.time.*;
import java.time.temporal.ChronoUnit;

class QX37 {
	public static void main(String[] args) {
		Duration tenYears = ChronoUnit.YEARS.getDuration().multipliedBy(10);
		Duration aDecade = ChronoUnit.DECADES.getDuration();
		assert tenYears.equals(aDecade) : "10 years is not a decade!";			
	}
}