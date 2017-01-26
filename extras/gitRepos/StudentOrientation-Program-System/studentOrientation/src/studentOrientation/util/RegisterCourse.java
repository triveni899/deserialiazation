package studentOrientation.util;

public enum RegisterCourse implements RegisterCourseMeasureI {
	RegisterviaForm(100.0),
	RegisterviaComputer(103.0)
	;

	private final double price;
	ValueInterface v;
	/**
	 * 
	 * @param priceIn //price of registration
	 */
	RegisterCourse(double priceIn)
	{
		this.price=priceIn;
	}
	
	/**
	 * @param course //reference of RegisterCourse
	 * @return double
	 */
	@Override
	public double calcDuration(RegisterCourse course) {
		// TODO Auto-generated method stub
		v=new Duration();
		return v.getRegistrationValue(course);
		
	}
	
	/**
	 * @param course //reference of RegisterCourse
	 * @return double
	 */

	@Override
	public double calcCost(RegisterCourse course) {
		// TODO Auto-generated method stub
		v=new Cost();
		return v.getRegistrationValue(course);
	}

	/**
	 * @param course //reference of RegisterCourse
	 * @return double
	 */
	@Override
	public double calcCbFootprint(RegisterCourse course) {
		// TODO Auto-generated method stub
		v=new CarbonFootPrint();
		return v.getRegistrationValue(course);
	
	}

	/**
	 * @param course //reference of RegisterCourse
	 * @return double
	 */
	@Override
	public double calcEffort(RegisterCourse course) {
		// TODO Auto-generated method stub
		v=new Effort();
		return v.getRegistrationValue(course);
		
	}

}
