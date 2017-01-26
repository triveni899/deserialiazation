package studentOrientation.util;


public class CarbonFootPrint implements ValueInterface{

	/**
	 * @param b //reference of Books
	 * @return double
	 */
	@Override
	public double getBookValue(Books b) {
		// TODO Auto-generated method stub
		double d=0.0;
		if(b==Books.mandoBooks)
		{
			d=(double)RandomGenerator.getRandomInteger(RandomNumber.footprintHigh.getNumVal(), RandomNumber.footprintLow.getNumVal());
			
		}else if(b==Books.universityBooks)
		{
			d=(double)RandomGenerator.getRandomInteger(RandomNumber.footprintHigh.getNumVal(), RandomNumber.footprintLow.getNumVal());
		}
		return d;
		
	}
	
	/**
	 * @param ct //reference of CampusTour
	 * @return double
	 */

	@Override
	public double getCampusTourValue(CampusTour ct) {
		// TODO Auto-generated method stub
		double d=0.0;
		if(ct==CampusTour.busRide)
		{
			d=(double)RandomGenerator.getRandomInteger(RandomNumber.footprintHigh.getNumVal(), RandomNumber.footprintLow.getNumVal());
			
		}else if(ct==CampusTour.onFoot)
		{
			d=(double)RandomGenerator.getRandomInteger(RandomNumber.footprintHigh.getNumVal(), RandomNumber.footprintLow.getNumVal());
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
		double d=0.0;
		if(course==RegisterCourse.RegisterviaForm)
		{
			d=(double)RandomGenerator.getRandomInteger(RandomNumber.footprintHigh.getNumVal(), RandomNumber.footprintLow.getNumVal());
			
		}else if(course==RegisterCourse.RegisterviaComputer)
		{
			d=(double)RandomGenerator.getRandomInteger(RandomNumber.footprintHigh.getNumVal(), RandomNumber.footprintLow.getNumVal());
		}
		return d;
		 
	}

	
	/**
	 * @param dorm //reference of Dorm
	 * @return double
	 */
	@Override
	public double getDormValue(Dorm dorm) {
		// TODO Auto-generated method stub
		double d=0.0;
		if(dorm==Dorm.onlineGame)
		{
			d=(double)RandomGenerator.getRandomInteger(RandomNumber.footprintHigh.getNumVal(), RandomNumber.footprintLow.getNumVal());
			
		}else if(dorm==Dorm.standInQueue)
		{
			d=(double)RandomGenerator.getRandomInteger(RandomNumber.footprintHigh.getNumVal(), RandomNumber.footprintLow.getNumVal());
		}
		return d;
	}

}
