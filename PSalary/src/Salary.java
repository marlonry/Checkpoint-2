public class Salary {
	private double gross;
	/**
	 * creates Salary Constructor
	 */
	public Salary(double gross) { 
		this.gross = gross;
	}

	/**
	 * returns the gross Salary attribute
	 * @return gross;
	 */
	public double getGross() {
		return gross;
	}

	/**
	 * sets the gross salary
	 * @param gross
	 */
	public void setGross(double gross) {
		this.gross = gross;
	}
	
	/**
	 * calculates tax depending on the salary amount
	 * @return tax
	 */
	public double getTax() {
		double tax = 0; 
		if((this.gross > 0) && (this.gross <= 14000)) {
//			tax = gross * 0.105;
			tax = 0.105;
		} else if ((this.gross > 14001)  && (this.gross <= 48000)) {
//			tax = gross * 0.175;
			tax = 0.175;
		} else if ((this.gross > 48001) && (this.gross <= 70000 )) {
//			tax = gross * 0.30;
			tax = 0.30;
		} else if (this.gross > 70001) {
//			tax = gross * 0.33;
			tax = 0.33;
		}
		
		return tax;
	}
	
	public double getNet() {
		double tax = getTax();
		double net = this.gross * tax;
		
		System.out.println(net);
		return net;
	};	
}
