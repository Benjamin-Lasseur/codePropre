package ex4;

public class FermeReptile extends Zone {

	
	/* (non-Javadoc)
	 * @see ex4.Zone#calculerKgsNourritureParJour()
	 */
	public double calculerKgsNourritureParJour() {
		return animaux.size() * 0.1;
	}
}
