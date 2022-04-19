public class StringBuilderInJava {
	public static void main(String[] argv)
		throws Exception
	{
		StringBuilder str
			= new StringBuilder();

		str.append("GFG");

		// print string
		System.out.println("String = "
						+ str.toString());
	}
}
