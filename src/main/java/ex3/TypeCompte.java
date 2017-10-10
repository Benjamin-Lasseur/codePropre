package ex3;

public enum TypeCompte {
	LA("Livret A"), CC("Compte courant");
	private String nom;

	private TypeCompte(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}
}
