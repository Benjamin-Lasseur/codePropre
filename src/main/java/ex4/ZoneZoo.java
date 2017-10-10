package ex4;

public enum ZoneZoo {
	/** ZONE_CARNIVORE : ZoneZoo */
	ZONE_CARNIVORE("Zone Carnivore"),
	/** FERME_REPTILE : ZoneZoo */
	FERME_REPTILE("Ferme Reptile"),
	/** AQUARIUM : ZoneZoo */
	AQUARIUM("Aquarium"),
	/** SAVANE_AFRICAINE : ZoneZoo */
	SAVANE_AFRICAINE("Savane Afriquaine");
	/** nom : String */
	private String nom;

	/**
	 * Construteur
	 * 
	 * @param nom
	 */
	private ZoneZoo(String nom) {
		this.nom = nom;
	}

	/**
	 * Donne le nom de la zone
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;
	}

}
