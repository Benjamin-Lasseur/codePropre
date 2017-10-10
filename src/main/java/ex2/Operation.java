package ex2;

public enum Operation {
	/** SOMME : Operation */
	SOMME("Somme"),
	/** MOYENNE : Operation */
	MOYENNE("Moyenne");

	/** nom : String */
	private String nom;

	/**
	 * @param nom
	 *            nom
	 */
	private Operation(String nom) {
		this.nom = nom;
	}

	/*
	 * @return nom nom
	 */
	@Override
	public String toString() {
		return nom;
	}

}
