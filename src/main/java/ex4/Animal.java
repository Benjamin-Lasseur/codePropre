package ex4;

public class Animal {

	/** nom : String */
	protected String nom;
	/** comportement : Comportement */
	protected Comportement comportement;
	/** zone : ZoneZoo */
	protected ZoneZoo zone;

	/**Constructeur
	 * @param nom
	 * @param comportement
	 * @param zone
	 */
	public Animal(String nom, Comportement comportement, ZoneZoo zone) {
		this.nom = nom;
		this.comportement = comportement;
		this.zone = zone;
	}

	/* Méthode toString donnant le nom, la zone et le comportement
	 * 
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(nom).append(" | ").append(zone.getNom()).append(" | ")
				.append(comportement.toString());
		System.out.println(str);
		return str.toString();
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the comportement
	 */
	public Comportement getComportement() {
		return comportement;
	}

	/**
	 * @param comportement
	 *            the comportement to set
	 */
	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}

	/**
	 * @return the zone
	 */
	public ZoneZoo getZone() {
		return zone;
	}

	/**
	 * @param zone
	 *            the zone to set
	 */
	public void setZone(ZoneZoo zone) {
		this.zone = zone;
	}

}
