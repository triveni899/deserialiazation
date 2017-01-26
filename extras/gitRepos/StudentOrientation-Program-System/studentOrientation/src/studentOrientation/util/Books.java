package studentOrientation.util;


public enum Books implements BookMeasureI {
	universityBooks(100.00),
	mandoBooks(105.00)
	;

	private final double price;
	//private final double duration;
	ValueInterface v;
	
	/**
	 * 
	 * @param priceIn //priceof book
	 */
	Books(double priceIn)
	{
		this.price=priceIn;
	 
	}
	
	
	/**
	 * @param b //reference of Books
	 * @return double
	 */
	@Override
	public double calcDuration(Books b) {
		// TODO Auto-generated method stub
		v=new Duration();
		return v.getBookValue(b);
		
	}
	/**
	 * @param b //reference of Books
	 * @return double
	 */

	@Override
	public double calcCost(Books b) {
		// TODO Auto-generated method stub
		
		v=new Cost();
		return v.getBookValue(b);
		
	}
	
	
	/**
	 * @param b //reference of Books
	 * @return double
	 */

	@Override
	public double calcCbFootprint(Books b) {
		
		v=new CarbonFootPrint();
		return v.getBookValue(b);
		// TODO Auto-generated method stub
		
		
	}
	
	
	/**
	 * @param b //reference of Books
	 * @return double
	 */
	@Override
	public double calcEffort(Books b) {
		v=new Effort();
		return v.getBookValue(b);
		// TODO Auto-generated method stub
		
	}

}
