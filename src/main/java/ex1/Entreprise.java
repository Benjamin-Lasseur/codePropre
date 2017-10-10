package ex1;

import java.util.Date;

/**
 * @author ETY5
 *
 */
public class Entreprise {

	/** siret : int */
	private int siret;
	/** nom : String */
	private String nom;
	/** adresse : String */
	private String adresse;
	/** dateCreation : Date */
	private Date dateCreation;

	/** CAPTIAL_MAX : int */
	public static final int CAPTIAL_MAX = 3000000;

	/**
	 * Cette méthode affiche le status de l'entreprise Le status est constitué
	 * du siret, du nom, de l'adresse, et de la date de création
	 */
	public void afficherStatut() {
		System.out.println("Siret :" + siret + " Nom: " + nom + " Adresse :" + adresse + " Date de Création :"
				+ dateCreation.toString());
	}

}
