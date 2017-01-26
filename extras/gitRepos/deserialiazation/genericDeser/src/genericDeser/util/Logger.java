package genericDeser.util;

public class Logger {

	public static enum DebugLevel {
		NONE, CONSTRUCTOR, POP_OBJ
	};

	private static DebugLevel debugLevel;

	/**
	 * 
	 * @param levelIn
	 */
	public static void setDebugValue(int levelIn) {
		switch (levelIn) {
		case 0:
			debugLevel = DebugLevel.NONE;
			break;
		case 1:
			debugLevel = DebugLevel.CONSTRUCTOR;
			break;
		case 2:
			debugLevel = DebugLevel.POP_OBJ;
			break;
		}
	}

	public static void setDebugValue(DebugLevel levelIn) {
		debugLevel = levelIn;
	}

	public static DebugLevel getDebugValue() {
		return debugLevel;
	}

	// @return None
	public static void writeMessage(String message, DebugLevel levelIn) {
		if (levelIn == debugLevel)
			System.out.println(message);
	}

	public String toString() {
		return "Debug Level is " + debugLevel;
	}
}
