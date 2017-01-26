package genericDeser.driver;

import java.lang.reflect.InvocationTargetException;

import genericDeser.fileOperations.FileProcessor;
import genericDeser.util.Logger;
import genericDeser.util.PopulateObjects;

public class Driver {

	public static void main(String args[]) {
		if (args.length != 2) {
			System.out.println("Please enter valid arguments.");
			System.exit(1);
		}
		Logger.setDebugValue(Integer.parseInt(args[1]));
		PopulateObjects p = new PopulateObjects(new FileProcessor(args[0]));
		try {
			p.deserObjects(args[0]);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException | InstantiationException e) {
			e.printStackTrace();
		}
	}
}
