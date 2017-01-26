package studentOrientation.util;


public enum CampusTour implements CampusTourMeasureI{
	busRide(2.00),
	onFoot(0.10)
	;
    private final double price; 
    ValueInterface v;
    
    /**
     * 
     * @param priceIn //price associated with CampusTour
     */
	CampusTour(double priceIn)
	{
		this.price=priceIn;
	}
	
	/**
	 * @param ct //reference of CampusTour
	 * @return double
	 */
	@Override
	public double calcDuration(CampusTour ct) {
		// TODO Auto-generated method stub
		v=new Duration();
		return v.getCampusTourValue(ct);
		
	}

	/**
	 * @return double
	 */
	@Override
	public double calcCost() {
		// TODO Auto-generated method stub
		return price;
	}

	/**
	 * @param ct //reference of CampusTour
	 * @return double
	 */
	@Override
	public double calcCbFootprint(CampusTour ct) {
		// TODO Auto-generated method stub
		v=new CarbonFootPrint();
		return v.getCampusTourValue(ct);
	}

	
	/**
	 * @param ct //reference of CampusTour
	 * @return double
	 */
	@Override
	public double calcEffort(CampusTour ct) {
		// TODO Auto-generated method stub
		v=new Effort();
		return v.getCampusTourValue(ct);
		
	}

}
