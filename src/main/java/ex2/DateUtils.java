package ex2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
	public static String format(LocalDateTime date) {
		if (date != null) {
			return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		}
		return null;
	}

}
