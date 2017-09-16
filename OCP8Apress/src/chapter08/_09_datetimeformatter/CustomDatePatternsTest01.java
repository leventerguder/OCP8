package chapter08._09_datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomDatePatternsTest01 {

	public static void main(String[] args) {
	       // patterns from simple to complex ones
        String [] dateTimeFormats = {
                "dd-MM-yyyy", 
                "d '('E')' MMM, YYYY", 
                "w'th week of' YYYY", 
                "EEEE, dd'th' MMMM, YYYY" 
        };
            LocalDateTime now = LocalDateTime.now();
            for(String dateTimeFormat : dateTimeFormats) {
                System.out.printf("Pattern \"%s\" is %s %n", dateTimeFormat,
                        DateTimeFormatter.ofPattern(dateTimeFormat).format(now));
} }

}
