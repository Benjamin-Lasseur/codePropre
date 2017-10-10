package ex4;

public class SavaneAfricaine extends Zone {

	/* (non-Javadoc)
	 * @see ex4.Zone#calculerKgsNourritureParJour()
	 */
	public double calculerKgsNourritureParJour() {
		return animaux.size() * 10.0;
	}

}
