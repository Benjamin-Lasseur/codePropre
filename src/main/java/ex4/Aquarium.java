package ex4;

/**
 * Zone Aquarium
 * 
 * @author ETY5
 *
 */
public class Aquarium extends Zone {

	
	
	/* (non-Javadoc)
	 * @see ex4.Zone#calculerKgsNourritureParJour()
	 */
	public double calculerKgsNourritureParJour() {
		return animaux.size() * 0.2;
	}
}
