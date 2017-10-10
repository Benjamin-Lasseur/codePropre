package ex2;

import java.time.LocalDateTime;

public class ComptageStock {

	/** nb : int */
	private int nb;
	/** resultat : int */
	private int resultat;
	/** dateDebutComptage : Date */
	private LocalDateTime dateDebutComptage;
	/** dateFinComptage : Date */
	private LocalDateTime dateFinComptage;

	/**
	 * @param type
	 */
	public void afficheStatutComptage(Operation type) {

		afficherResultats(type);
		afficherDateDebut();
		afficherDateFin();

	}

	/**
	 * Affiche le résultat en fonction du type d'opération
	 * 
	 * @param op
	 *            : le type d'opération
	 */
	public void afficherResultats(Operation op) {
		System.out.println("Ce comptage est de type " + op.toString());
		System.out.println("Nombre d'élements " + nb);
		if (op.equals(Operation.MOYENNE)) {
			try {
				System.out.println("Résultat " + resultat / nb);
			} catch (ArithmeticException e) {
				System.out.println(e.toString());
			}
		} else if (op.equals(Operation.SOMME)) {
			System.out.println("Résultat " + resultat);
		}
	}

	/**
	 * Affiche la date de début en utilisant le formattage de la classe
	 * DateUtils
	 * 
	 */
	private void afficherDateDebut() {
		System.out.println(DateUtils.format(dateDebutComptage));
	}

	/**
	 * Affiche la date de fin en utilisant le formattage de la classe DateUtils
	 * Donne le status du comptage en fonction de la date de fin
	 */
	private void afficherDateFin() {
		if (dateFinComptage != null) {
			System.out.println("Le comptage est clos depuis le " + DateUtils.format(dateFinComptage));
			if (nb == 0) {
				System.out.println("Le comptage est clos mais n'a pas d'éléments. Le comptage est en anomalie.");
			} else {
				System.out.println("Le comptage est clos et est OK.");
			}
		} else {
			System.out.println("Le compte est actif.");
		}
	}

	/**
	 * Retourne la date de fin de comptage
	 * 
	 * @return la date de fin de comptage
	 */
	public LocalDateTime getDateFinComptage() {
		return dateFinComptage;
	}

	/**
	 * Ajoute un montant au résulat et incrémente le nombre d'éléments
	 * 
	 * @param montant
	 *            Montatn
	 */
	public void ajouterElement(int montant) {
		nb++;
		resultat += montant;
	}

	/**
	 * @return the nb
	 */
	public int getNb() {
		return nb;
	}

	/**
	 * @param nb
	 *            the nb to set
	 */
	public void setNb(int nb) {
		this.nb = nb;
	}

	/**
	 * @return the resultat
	 */
	public int getResultat() {
		return resultat;
	}

	/**
	 * @param resultat
	 *            the resultat to set
	 */
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}

	/**
	 * @return the dateDebutComptage
	 */
	public LocalDateTime getDateDebutComptage() {
		return dateDebutComptage;
	}

	/**
	 * @param dateDebutComptage
	 *            the dateDebutComptage to set
	 */
	public void setDateDebutComptage(LocalDateTime dateDebutComptage) {
		this.dateDebutComptage = dateDebutComptage;
	}

	/**
	 * @param dateFinComptage
	 *            the dateFinComptage to set
	 */
	public void setDateFinComptage(LocalDateTime dateFinComptage) {
		this.dateFinComptage = dateFinComptage;
	}
}
