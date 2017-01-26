package studentOrientation.util;


public class BuildPlan implements BuildPlanInterface{
	
	/**
	 * @param spi //reference of StudentPlanInterface
	 */
	@Override
	public void construct(StudentPlanInterface spi) {
		// TODO Auto-generated method stub
		spi.takeCampusTour();
		spi.buyBooks();
		spi.selectDorm();
		spi.registerCourses();
		
	}

}
