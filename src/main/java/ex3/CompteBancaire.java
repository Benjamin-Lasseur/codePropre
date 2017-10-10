package ex3;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A
 * (type=LA)
 * 
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	protected TypeCompte type;

	/**
	 * @param solde
	 * @param type
	 */
	public CompteBancaire(double solde, TypeCompte type) {
		this.solde = solde;
		this.type = type;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Ajoute un retirer un montant au solde
	 * 
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

}
