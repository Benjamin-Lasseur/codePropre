package ex4;

public enum ZoneZoo {
	ZONE_CARNIVORE("Zone Carnivore"), FERME_REPTILE("Ferme Reptile"), AQUARIUM("Aquarium"), SAVANE_AFRICAINE(
			"Savane Afriquaine");
	private String nom;

	private ZoneZoo(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the zone
	 */
	public String getNom() {
		return nom;
	}

}
