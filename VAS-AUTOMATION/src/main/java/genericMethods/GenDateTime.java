package genericMethods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GenDateTime {

	public String  exDateTime() {
		
		LocalDateTime dateTime = LocalDateTime.now();
	    DateTimeFormatter  dateTmeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH-mm-ss");
	    String  currDateTime = dateTime.format(dateTmeFormat);
		return currDateTime;
		
	}
}
 