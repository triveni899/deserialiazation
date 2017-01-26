package genericDeser.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import genericDeser.fileOperations.FileProcessor;

public class PopulateObjects {
	static FileProcessor fpobj;
	String input = "";
	String firstClass = "genericDeser.util.First";
	String secondClass = "fqn:genericDeser.util.Second";
	First firstobj;
	Second secondobj;
	int firstTotalCount = 0;
	int secondTotalCount = 0;

	private HashMap<Integer, First> FirstMap;
	private HashMap<Integer, Second> SecondMap;

	public PopulateObjects(FileProcessor fpobjIn) {
		if (Logger.DebugLevel.CONSTRUCTOR != null) {
			if (Logger.getDebugValue() == Logger.DebugLevel.CONSTRUCTOR)
				System.out.println("Populate Object Constructor is called");
		}
		fpobj = fpobjIn;

		FirstMap = new HashMap<Integer, First>();
		SecondMap = new HashMap<Integer, Second>();
	}

	public void findAndPlaceFirst(int HashCode, First fIn) {
		First fT = FirstMap.get(HashCode);
		if (fT != null) {
			if (!fT.equals(fIn)) {
				findAndPlaceFirst(HashCode + fT.hashCode(), fIn);
			}
		} else {
			FirstMap.put(HashCode, fIn);
		}
	}

	public void findAndPlaceSecond(int HashCode, Second sIn) {
		Second sT = SecondMap.get(HashCode);
		if (sT != null) {
			if (!sT.equals(sIn)) {
				findAndPlaceSecond(HashCode + sT.hashCode(), sIn);
			}
		} else {
			SecondMap.put(HashCode, sIn);
		}
	}

	public void deserObjects(String InputFile) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {

		FileProcessor proc = new FileProcessor(InputFile);

		String stmt = proc.readLine();
		String st[];
		while (stmt != null) {

			if (stmt.subSequence(0, 3).equals("fqn")) {
				if (stmt.endsWith("First")) {
					First F = null;
					String clsName = "genericDeser.util.First";
					Class cls = Class.forName(clsName);
					Class[] signature = new Class[1];
					Object obj = cls.newInstance();
					firstTotalCount++;
					F = (First) obj;
					stmt = proc.readLine();
					while (stmt != null && !(stmt.subSequence(0, 3).equals("fqn"))) {
						st = stmt.split(",");
						String type = (st[0].trim()).substring(5);
						String variable = (st[1].trim()).substring(4);
						String value = (st[2].trim()).substring(6);

						if (type.equals("int"))
							signature[0] = Integer.TYPE;
						else if (type.equals("float"))
							signature[0] = Float.TYPE;
						else if (type.equals("short"))
							signature[0] = Short.TYPE;
						else if (type.equals("String"))
							signature[0] = String.class;

						String methdName = "set" + variable;
						Method meth = cls.getMethod(methdName, signature);

						Object[] params = new Object[1];

						if (type.equals("int"))
							params[0] = new Integer(Integer.parseInt(value));
						else if (type.equals("float"))
							params[0] = new Float(Float.parseFloat(value));
						else if (type.equals("short"))
							params[0] = new Short(Short.parseShort(value));
						else if (type.equals("String"))
							params[0] = value;

						Object result = meth.invoke(obj, params);

						stmt = proc.readLine();
					}
					findAndPlaceFirst(F.hashCode(), F);
				} else {
					Second S = null;
					stmt = proc.readLine();
					String clsName = "genericDeser.util.Second";
					Class cls = Class.forName(clsName);
					Class[] signature = new Class[1];
					Object obj = cls.newInstance();
					secondTotalCount++;
					S = (Second) obj;
					while (stmt != null && !(stmt.subSequence(0, 3).equals("fqn"))) {
						st = stmt.split(",");
						String type = (st[0].trim()).substring(5);
						String variable = (st[1].trim()).substring(4);
						String value = (st[2].trim()).substring(6);

						if (type.equals("int"))
							signature[0] = Integer.TYPE;
						else if (type.equals("boolean"))
							signature[0] = Boolean.TYPE;
						else if (type.equals("double"))
							signature[0] = Double.TYPE;

						String methdName = "set" + variable;
						Method meth = cls.getMethod(methdName, signature);

						Object[] params = new Object[1];

						if (type.equals("int"))
							params[0] = new Integer(Integer.parseInt(value));
						else if (type.equals("double"))
							params[0] = new Double(Double.parseDouble(value));
						else if (type.equals("boolean"))
							params[0] = new Boolean(Boolean.parseBoolean(value));

						Object result = meth.invoke(obj, params);
						stmt = proc.readLine();
					}
					findAndPlaceSecond(S.hashCode(), S);
				}
			}
		}

		System.out.println("Unique First Objects: " + FirstMap.size());
		System.out.println("Total First Objects: " + firstTotalCount);
		System.out.println("Unique Second Objects: " + SecondMap.size());
		System.out.println("Total Second Objects: " + secondTotalCount);
	}
}
