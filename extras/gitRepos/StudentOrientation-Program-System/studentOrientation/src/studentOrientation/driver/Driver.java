package studentOrientation.driver;

import studentOrientation.util.Books;
import studentOrientation.util.BuildPlan;
import studentOrientation.util.BuildPlanInterface;
import studentOrientation.util.CampusTour;
import studentOrientation.util.Dorm;
import studentOrientation.util.RegisterCourse;
import studentOrientation.util.Student1;
import studentOrientation.util.StudentPlanInterface;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentPlanInterface stud1 = new Student1(Books.mandoBooks,CampusTour.busRide,Dorm.onlineGame,RegisterCourse.RegisterviaComputer);
		BuildPlanInterface plan = new BuildPlan();
		plan.construct(stud1);
		stud1.displaytotal();
		 

	}

}