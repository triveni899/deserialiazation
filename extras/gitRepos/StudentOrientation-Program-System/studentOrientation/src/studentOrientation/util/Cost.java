package studentOrientation.util;


public class Cost implements ValueInterface{

	/**
	 * @param b //reference of Books
	 * @return double
	 */
	@Override
	public double getBookValue(Books b) {
		// TODO Auto-generated method stub
		double d=(double)RandomGenerator.getRandomInteger(RandomNumber.costHigh.getNumVal(), RandomNumber.costlow.getNumVal());;
		if(b==Books.mandoBooks)
		{
			 
			return d;
			
		}else if(b==Books.universityBooks)
		{
			d=d-(0.05*d);
			return d;
		}
		return d;
	}

	
	/**
	 * @param ct //reference of CampusTour
	 * @return double
	 */
	@Override
	public double getCampusTourValue(CampusTour ct) {
		double d=0.0;
		if(ct==CampusTour.busRide)
		{
			d=(double)RandomGenerator.getRandomInteger(RandomNumber.costHigh.getNumVal(), RandomNumber.costlow.getNumVal());
			
		}else if(ct==CampusTour.onFoot)
		{
			d=(double)RandomGenerator.getRandomInteger(RandomNumber.costHigh.getNumVal(), RandomNumber.costlow.getNumVal());
		}
		return d;
		
		
		
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * @param dorm //reference of Dorm
	 * @return double
	 */

	@Override
	public double getDormValue(Dorm dorm) {
		// TODO Auto-generated method stub
		double d=(double)RandomGenerator.getRandomInteger(RandomNumber.costHigh.getNumVal(), RandomNumber.costlow.getNumVal());;
		if(dorm==Dorm.standInQueue)
		{
			 
			return d;
		}else if(dorm==Dorm.onlineGame)
		{
			d=d+(0.02*d);
			return d;
		}		
		return d;
		
		
	}

	/**
	 * @param course //reference of RegisterCourse
	 * @return double
	 */
	
	@Override
	public double getRegistrationValue(RegisterCourse course) {
		// TODO Auto-generated method stub
		double d=(double)RandomGenerator.getRandomInteger(RandomNumber.costHigh.getNumVal(), RandomNumber.costlow.getNumVal());
		if(course==RegisterCourse.RegisterviaForm)
		{
		    d=d-(0.03*d);
			return d;
			
		}else if(course==RegisterCourse.RegisterviaComputer)
		{
			
			return d;
		}
		return d;
	}
}
