package studentOrientation.util;


public enum Dorm implements DormMeasureI {
	standInQueue(10.00),
	onlineGame(12.00)
	;

	private final double price;
	ValueInterface v;
	
	/**
	 * 
	 * @param priceIn  //price associated with Dorm
	 */
	Dorm(double priceIn)
	{
		this.price=priceIn;
	}
	
	
	/**
	 * @param dorm //reference of Dorm
	 * @return double
	 */
	@Override
	public double calcDuration(Dorm dorm) {
		// TODO Auto-generated method stub
		v=new Duration();
		return v.getDormValue(dorm);
		
	}

	
	/**
	 * @param dorm //reference of Dorm
	 * @return double
	 */
	@Override
	public double calcCost(Dorm dorm) {
		// TODO Auto-generated method stub
		return price;
	}
	
	
	/**
	 * @param dorm //reference of Dorm
	 * @return double
	 */

	@Override
	public double calcCbFootprint(Dorm dorm) {
		// TODO Auto-generated method stub
		v=new CarbonFootPrint();
		return v.getDormValue(dorm);
		
	}

	
	/**
	 * @param dorm //reference of Dorm
	 * @return double
	 */
	@Override
	public double calcEffort(Dorm dorm) {
		// TODO Auto-generated method stub
		v=new Effort();
		return v.getDormValue(dorm);
		
		
	}

}
