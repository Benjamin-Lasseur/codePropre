package ex2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author ETY5 Classe utilitaire
 */
public class DateUtils {

	/**
	 * Retourne une string d'une date formatée
	 * 
	 * @param date
	 * @return
	 */
	public static String format(LocalDateTime date) {
		if (date != null) {
			return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		}
		return null;
	}

}
