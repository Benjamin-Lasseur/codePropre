package ex2;

public enum Operation {
	SOMME("Somme"), MOYENNE("Moyenne");

	private String nom;

	private Operation(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString(){
		return nom;
	}

}
