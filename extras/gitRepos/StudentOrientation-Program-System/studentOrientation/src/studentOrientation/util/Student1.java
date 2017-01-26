package studentOrientation.util;

public class Student1 implements StudentPlanInterface{
	
	Books book;
	CampusTour ctour;
	Dorm dorm;
	RegisterCourse course;
	double durationCt,costCt,footprintCt,effortCt;
	double durationBk,costBk,footprintBk,effortBk;
	double durationDorm,costDorm,footprintDorm,effortDorm;
	double durationCourse,costCourse,footprintCourse,effortCourse;
	
	double totalduration,totalcost,totalfootprint,totaleffort;
	
	/**
	 * 
	 * @param bookIn  //reference of Books enum
	 * @param ctourIn //reference of Campustour enum
	 * @param dormIn  //reference of Dorm enum
	 * @param courseIn //reference of RegisterCourse enum
	 */
	public Student1(Books bookIn,CampusTour ctourIn,Dorm dormIn,RegisterCourse courseIn)
	{
		this.book=bookIn;
		this.ctour=ctourIn;
		this.dorm=dormIn;
		this.course=courseIn;
 
		
			
	}

	@Override
	public void takeCampusTour() {
		// TODO Auto-generated method stub
		durationCt=ctour.calcDuration(ctour);
		 //System.out.println("Duration of campus tour is "+ durationCt);
		 
		 costCt=ctour.calcCost();
		//System.out.println("Price of campus tour is "+costCt);
		
		footprintCt=ctour.calcCbFootprint(ctour);
		 //System.out.println("Carbon Foot print of campus tour is "+footprintCt);
		
		effortCt=ctour.calcEffort(ctour);
			//System.out.println("Effort of campus tour is "+effortCt);
	}

	@Override
	public void buyBooks() {
		// TODO Auto-generated method stub
		//System.out.println();
		durationBk=book.calcDuration(book);
        //System.out.println("Duration of buying books is "+durationBk);
        costBk=book.calcCost(book);
		//System.out.println("Price of the book is "+costBk);
		footprintBk=book.calcCbFootprint(book);
		 //System.out.println("Carbon Foot print of book buying is "+footprintBk);
		 effortBk=book.calcEffort(book);
			//System.out.println("Effort of buying books is "+effortBk);
		
	}

	@Override
	public void selectDorm() {
		// TODO Auto-generated method stub
		//System.out.println();
		durationDorm=dorm.calcDuration(dorm);
		//System.out.println("Duration of selecting dorm is "+durationDorm);
		costDorm=dorm.calcCost(dorm);
		//System.out.println("Price of selecting Dorm is "+costDorm);
		footprintDorm=dorm.calcCbFootprint(dorm);
		 //System.out.println("Carbon Foot print of selecting dorm is "+footprintDorm);
		 effortDorm=dorm.calcEffort(dorm);
			//System.out.println("Effort of selecting dorm is "+effortDorm);
		
	}

	@Override
	public void registerCourses() {
		// TODO Auto-generated method stub
		//System.out.println();
		durationCourse=course.calcDuration(course);
		//System.out.println("Duration of registering course is "+durationCourse);
		costCourse=course.calcCost(course);
		//System.out.println("Price of registering course is "+costCourse);
		footprintCourse=course.calcCbFootprint(course);
		//System.out.println("Carbon Foot print of course registry is "+footprintCourse);
		effortCourse=course.calcEffort(course);
		//System.out.println("Effort of course registry is "+effortCourse);
		
	}
	
	public void displaytotal()
	{
		double totalduration= durationCt+durationBk+durationDorm+durationCourse;
		double totalcost=costCt+costBk+costDorm+costCourse;
		double totalfootprint=footprintCt+footprintBk+footprintDorm+footprintCourse;
		double totaleffort=effortCt+effortBk+effortDorm+effortCourse;
		
		
		//System.out.println();
		System.out.println("Total Duration: "+totalduration);
		System.out.println("Total Cost: "+totalcost);
		System.out.println("Total Carbon Foot Print: "+totalfootprint);
		System.out.println("Total Effort: "+totaleffort);
		
	}

	
	
}
