package ex5;

import java.util.Date;

public class Pret {

	/** strategy : Strategy */
	private Strategy strategy;
	/** capital : double */
	private double capital;
	/** capitalRestantDu : double */
	private double capitalRestantDu;
	/** taux : double */
	private double taux;
	/** dateDebut : Date */
	private Date dateDebut;
	/** dateFin : Date */
	private Date dateFin;

	/**
	 * Construteur
	 * 
	 * @param capital
	 * @param taux
	 * @param dateDebut
	 */
	public Pret(double capital, double taux, Date dateDebut) {
		super();
		this.strategy = new PretATerme();
		this.capital = capital;
		this.taux = taux;
		this.dateDebut = dateDebut;
	}

	/**
	 * Constructeur
	 * 
	 * @param capital
	 * @param taux
	 * @param dateDebut
	 * @param dateFin
	 */
	public Pret(double capital, double taux, Date dateDebut, Date dateFin) {
		this(capital, taux, dateDebut);
		this.dateFin = dateFin;
	}

	/**
	 * Constructeur
	 * 
	 * @param capital
	 * @param taux
	 * @param dateDebut
	 * @param dateFin
	 * @param capitalRestantDu
	 */
	public Pret(double capital, double taux, Date dateDebut, Date dateFin, double capitalRestantDu) {
		this(capital, taux, dateDebut, dateFin);
		this.capitalRestantDu = capitalRestantDu;
	}

	/**
	 * Getter for strategy
	 * 
	 * @return the strategy
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/**
	 * Setter
	 * 
	 * @param strategy
	 *            the strategy to set
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * Getter for capital
	 * 
	 * @return the capital
	 */
	public double getCapital() {
		return capital;
	}

	/**
	 * Setter
	 * 
	 * @param capital
	 *            the capital to set
	 */
	public void setCapital(double capital) {
		this.capital = capital;
	}

	/**
	 * Getter for capitalRestantDu
	 * 
	 * @return the capitalRestantDu
	 */
	public double getCapitalRestantDu() {
		return capitalRestantDu;
	}

	/**
	 * Setter
	 * 
	 * @param capitalRestantDu
	 *            the capitalRestantDu to set
	 */
	public void setCapitalRestantDu(double capitalRestantDu) {
		this.capitalRestantDu = capitalRestantDu;
	}

	/**
	 * Getter for taux
	 * 
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * Setter
	 * 
	 * @param taux
	 *            the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/**
	 * Getter for dateDebut
	 * 
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * Setter
	 * 
	 * @param dateDebut
	 *            the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Getter for dateFin
	 * 
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * Setter
	 * 
	 * @param dateFin
	 *            the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
