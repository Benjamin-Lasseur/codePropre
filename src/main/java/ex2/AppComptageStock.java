package ex2;

import java.time.LocalDateTime;

public class AppComptageStock {

	public static void main(String[] args) {
		ComptageStock cS = new ComptageStock();
		LocalDateTime dateDebut = LocalDateTime.of(2017, 9, 15, 12, 13, 14);
		LocalDateTime dateFin = LocalDateTime.of(2017, 10, 15, 12, 13, 14);
		cS.setDateFinComptage(dateFin);
		cS.setDateDebutComptage(dateDebut);
		cS.afficheStatutComptage(Operation.MOYENNE);

	}

}
