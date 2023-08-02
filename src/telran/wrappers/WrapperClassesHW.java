package telran.wrappers;

public class WrapperClassesHW {

	public static void main(String[] args) {
		if (args.length == 0) {
			String[] sample = { "int", "float", "short", "char", "double", "long", "byte" };
			for (int i = 0; i < sample.length; i++) {
				printingMinMax(sample[i]);
			}
		} else {
			for (int i = 0; i < args.length; i++) {
				printingMinMax(args[i]);
			}
		}

	}

	private static void printingMinMax(String primitive) {
		switch (primitive) {
		case "byte":
			System.out.println("Byte max value - " + Byte.MAX_VALUE);
			System.out.println("Byte min value - " + Byte.MIN_VALUE);
			break;
		case "int":
			System.out.println("Integer max value - " + Integer.MAX_VALUE);
			System.out.println("Integer min value - " + Integer.MIN_VALUE);
			break;
		case "short":
			System.out.println("Short max value - " + Short.MAX_VALUE);
			System.out.println("Short min value - " + Short.MIN_VALUE);
			break;
		case "long":
			System.out.println("Long max value - " + Long.MAX_VALUE);
			System.out.println("Long min value - " + Long.MIN_VALUE);
			break;
		case "char":
			System.out.println("Character max value - " + (int)Character.MAX_VALUE);
			System.out.println("Character min value - " + (int)Character.MIN_VALUE);
			break;
		case "float":
			System.out.println("Float max value - " + Float.MAX_VALUE);
			System.out.println("Float min value - " + Float.MIN_VALUE);
			break;
		case "double":
			System.out.println("Double max value - " + Double.MAX_VALUE);
			System.out.println("Double min value - " + Double.MIN_VALUE);
			break;
		default:
			System.out.println("Wrong argument");
			break;
		}
	}

}
