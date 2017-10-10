package ex4;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {
	/** animaux : List<Animal> */
	protected List<Animal> animaux = new ArrayList<>();

	/**
	 * Ajoute un animal
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	/**
	 * Affiche la liste des animaux dans la zone
	 */
	public void afficherListeAnimaux() {
		animaux.stream().forEach(Animal::toString);
	}

	/**
	 * Donne le nombre d'animaux dans la zone
	 * 
	 * @return
	 */
	public int compterAnimaux() {
		return animaux.size();
	}

	/**
	 * Donne la quantité de nourriture consommée dans la zone
	 * 
	 * @return
	 */
	public abstract double calculerKgsNourritureParJour();
}
