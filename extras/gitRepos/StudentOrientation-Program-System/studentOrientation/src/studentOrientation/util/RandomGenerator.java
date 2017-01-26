package studentOrientation.util;

public class RandomGenerator {
	public static int getRandomInteger(int maximum, int minimum){
		return ((int) (Math.random()*(maximum - minimum))) + minimum; 
		} 

}
