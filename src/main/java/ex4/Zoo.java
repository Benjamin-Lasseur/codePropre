package ex4;

import java.util.HashMap;
import java.util.Map;

public class Zoo {

	private String nom;
	private Map<String, Zone> zones = new HashMap<>();

	public Zoo(String nom) {
		this.nom = nom;
		zones.put(ZoneZoo.ZONE_CARNIVORE.getNom(), new ZoneCarnivore());
		zones.put(ZoneZoo.AQUARIUM.getNom(), new Aquarium());
		zones.put(ZoneZoo.FERME_REPTILE.getNom(), new FermeReptile());
		zones.put(ZoneZoo.SAVANE_AFRICAINE.getNom(), new SavaneAfricaine());
	}

	public void addAnimal(Animal animal) {
		zones.get(animal.getZone().getNom()).addAnimal(animal);
	}

	public void afficherListeAnimaux() {
		zones.values().stream().forEach(Zone::afficherListeAnimaux);
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
